class StaffList {
    private val staffList: MutableList<StaffMember> = mutableListOf()
    public fun addStaffMember(staffMember: StaffMember) {
        staffList.add(staffMember)
    }
    public fun payDay() {
        for (staffMember in staffList) {
            println(staffMember)
            println("Paid: $${staffMember.pay()}")
            println("-----------------------------------")
        }
    }
}