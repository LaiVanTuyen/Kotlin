class Executive:Employee() {
    private var bonus:Double=0.0
    override fun pay(): Double {
        return super.pay()*1.5+bonus
    }

    public fun awardBonus(execBonus:Double)
    {
        println(execBonus)
        bonus=execBonus
    }
}