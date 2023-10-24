package model

import java.io.Serializable

class SanPham: Serializable {
    private var ma: Int = 0
    private var ten: String = ""
    private var gia: Double = 0.0

    constructor()
    constructor(ma: Int, ten: String, gia: Double) {
        this.ma = ma
        this.ten = ten
        this.gia = gia
    }
    public var Ma:Int
        get() {return ma}
        set(value) {ma=value}
    public var Ten:String
        get() = ten
        set(value) {ten=value}
    public var Gia:Double
        get() {return gia}
        set(value) {gia=value}

    override fun toString(): String {
        return "$ma\t$ten\t$gia"
    }

}