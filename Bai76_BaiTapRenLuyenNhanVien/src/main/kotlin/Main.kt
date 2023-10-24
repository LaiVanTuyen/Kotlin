fun main(args: Array<String>) {
    var dsStaff:StaffList=StaffList()
    var teo=Executive()
    var ty=Hourly()
    ty.addHours(5)
    var tun=Executive()
    dsStaff.addStaffMember(teo)
    dsStaff.addStaffMember(ty)
    dsStaff.addStaffMember(tun)

    dsStaff.payDay()
}