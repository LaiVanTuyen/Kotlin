fun main(args: Array<String>) {
    data class User(var userName:String,var passWord:String)
    var user1=User("admin","123456")
    var user2=User("admin2","123456")
    println(user2.userName)
    println(user2.passWord)
}