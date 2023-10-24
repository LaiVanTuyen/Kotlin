package model

class SanPham {
    private var ma:Int=0
    private var ten:String=""
    private var gia:Double=0.0
    constructor()
    constructor(ma:Int,ten:String,gia:Double)
    {
        this.ma=ma
        this.ten=ten
        this.gia=gia
    }

    override fun toString(): String {
        return "$ma\t$ten\t$gia"
    }
}