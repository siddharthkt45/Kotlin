data class User(val name: String, val id: Int)

fun main() {
    val user = User("Alex", 1)
    println(user)

    val secondUser = User("Alex", 1)
    val thirdUser = User("Max", 2)

    println("user == secondUser: ${user == secondUser}")
    println("user === secondUser: ${user === secondUser}")
    println("user == thirdUser: ${user == thirdUser}")

    println(user.hashCode())
    println(thirdUser.hashCode())

    // copy function
    // No change happens in the actual user

    println(user.copy())
    println(user.copy(name = "Max"))
    println(user.copy(id = 2))

    println("name = ${user.component1()}")
    println("id = ${user.component2()}")
}