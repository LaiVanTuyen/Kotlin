package io

import model.SanPham
import org.w3c.dom.Document
import org.w3c.dom.Element
import java.io.File
import javax.xml.parsers.DocumentBuilder
import javax.xml.parsers.DocumentBuilderFactory
import javax.xml.transform.Transformer
import javax.xml.transform.TransformerFactory
import javax.xml.transform.dom.DOMSource
import javax.xml.transform.stream.StreamResult

class XMLFileFactory
{
    public fun LuuDuLieu(dsSp:MutableList<SanPham>, path:String):Boolean
    {
        try {
            val docFactory:DocumentBuilderFactory = DocumentBuilderFactory.newInstance()
            val docBuilder:DocumentBuilder =docFactory.newDocumentBuilder()
            val doc:Document=docBuilder.newDocument()
            val rootElement:Element =doc.createElement("SanPhams")
            doc.appendChild(rootElement)
            for (sp in dsSp)
            {
                val spElement=doc.createElement("SanPham")
                val maElement=doc.createElement("Ma")
                maElement.textContent=sp.ma.toString()
                val tenElement=doc.createElement("Ten")
                tenElement.textContent=sp.ten
                val giaElement=doc.createElement("Gia")
                giaElement.textContent=sp.gia.toString()

                spElement.appendChild(maElement)
                spElement.appendChild(tenElement)
                spElement.appendChild(giaElement)

                rootElement.appendChild(spElement)
            }

            val tranformFactory :TransformerFactory =TransformerFactory.newInstance()
            val tranform:Transformer =tranformFactory.newTransformer()
            val source:DOMSource= DOMSource(doc)
            val result:StreamResult=StreamResult(File(path).absolutePath)
            tranform.transform(source,result)
            return true
        }
        catch (ex:Exception)
        {
            ex.printStackTrace()
        }
        return false
    }
    public fun DocDuLieu(path:String):MutableList<SanPham>
    {
        val dsSp:MutableList <SanPham> = mutableListOf()
        try
        {
            val docBuilderFactor=DocumentBuilderFactory.newInstance()
            val docBuilder=docBuilderFactor.newDocumentBuilder()
            val xmlFile=File(path)
            val doc=docBuilder.parse(xmlFile)
            val nodeList=doc.documentElement.childNodes
            for(i in 0..<nodeList.length)
            {
                val node=nodeList.item(i)
                if(node is Element)
                {
                    val sp= SanPham()
                    val childNodes=node.childNodes
                    for (j in 0..<childNodes.length)
                    {
                        val childNode=childNodes.item(j)
                        if(childNode is Element)
                        {
                            val content=childNode.lastChild.textContent
                            when((childNode.nodeName))
                            {
                                "Ma"->sp.ma=content.toInt()
                                "Ten"->sp.ten=content
                                "Gia"->sp.gia=content.toDouble()
                            }
                        }
                    }
                    dsSp.add(sp)
                }
            }
        }
        catch (ex:Exception )
        {
            ex.printStackTrace()
        }
        return dsSp
    }
}