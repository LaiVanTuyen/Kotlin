import java.util.*

open class Person: Mammal {
    private var firstName:String=""
    private var dob:Date?=null
    private var bloodGroup:BloodGroup?=null
    var dsAddress:MutableList<Address> = mutableListOf()
    fun addAddress(addresss:Address)
    {
        dsAddress.add(addresss)
    }
    override fun setDateOfBirth(dob: Date) {
        this.dob=dob
    }

    override fun getAgeAsDays(): Int {
        return 1
    }

    public var FirstName:String
        get()=firstName
        set(value) {
            firstName=value
        }
    public var BloodGroup:BloodGroup?
        get()=bloodGroup
        set(value) {
            bloodGroup=value
        }
}