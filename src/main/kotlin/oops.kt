//class Person {
//
//}

//class Person(_name: String) {
//    val name: String
//
//    init {
//        name = _name
//    }
//}

//class Person constructor(_name: String) {
//    val name: String
//
//    init {
//        name = _name
//    }
//}

//class Person(_name: String) {
//    val name: String = _name
//              OR
//    val name = _name
//}

//class Person constructor(_name: String) {
//    val name: String = _name
//              OR
//    val name = _name
//}

class Person(val name: String)

fun main() {
    val p1 = Person("KT")
    print(p1.name)
}