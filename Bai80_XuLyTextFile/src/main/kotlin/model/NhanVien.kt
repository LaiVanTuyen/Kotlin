package model

import java.text.SimpleDateFormat
import java.util.Date

class NhanVien {
    private var ma:Int=0
    private var ten:String=""
    private var namSinh:Date?=null

    public var Ma:Int
        get() {return ma}
        set(value) {ma=value}
    public var Ten:String
        get() {return ten}
        set(value) {ten=value}
    public var NamSinh:Date?
        get() {return namSinh}
        set(value) {namSinh=value}

    constructor()
    constructor(ma: Int, ten: String, namSinh: Date?) {
        this.ma = ma
        this.ten = ten
        this.namSinh = namSinh
    }

    override fun toString(): String {
        var sdf= SimpleDateFormat("dd/MM/yyyy")
        return "NhanVien(ma=$ma, ten='$ten', namSinh=${sdf.format(namSinh)})"
    }


}