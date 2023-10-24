fun main(args: Array<String>) {
    var s1="HẠNH PHÚC"
    var s2="hạnh phúc"
    var kq=s1.compareTo(s2,ignoreCase = true)
    if(kq==0)
    {
        println("s1=s2")
    }
    else if(kq>0)
    {
        println("s1>s2")
    }
    else
    {
        println("s1<s2")
    }
}