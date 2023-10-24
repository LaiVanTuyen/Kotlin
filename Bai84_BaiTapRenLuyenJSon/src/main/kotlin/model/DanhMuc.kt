package model

class DanhMuc {
    private var ma:Int=0
    private var ten:String=""
    var dsSp:MutableList<SanPham> = mutableListOf()
    constructor()
    constructor(ma:Int,ten:String)
    {
        this.ma=ma
        this.ten=ten
    }

    override fun toString(): String {
        val msg="$ma\t$ten"
        val sb=StringBuilder()
        sb.append(msg)
        sb.append("\n")
        sb.append("------------------------------------\n")
        for (sp in dsSp)
        {
            sb.append(sp.toString())
            sb.append("\n")
        }
        sb.append("------------------------------------\n")
        return sb.toString()
    }
}