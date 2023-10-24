abstract class StaffMember {
    protected val name: String = ""
    protected val address: String = ""
    protected val phone: String = ""
    override fun toString(): String {
        return name+"\n"+address+"\n"+phone
    }
    public abstract fun pay(): Double
}