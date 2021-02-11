import java.util.Scanner;

fun main() {
    // String templates
//    var x = 5
//    println("Hello World! $x")

    // var and val
//    var x = 5      // var can be changed afterwards OR var can be reassigned
//    x = 30    can be done
//    val y = 6      // val can not be changed afterwards OR val can't be reassigned (immutable)
//    y = 34    can't be done

//    var name = "KT"
//    print("name is $name")

//    name = 23         // this can't be done because the data type of the variable has been decided already

    // Nullable Types
//    var myName: String? = null
//    by putting the '?' after the data type, the variable becomes a null type variable

    // if, else and when
//    var x = 19
//    if (x < 18) {
//        print("you can't vote")
//    } else {
//        print("you can vote")
//    }

//    val value: Int = if (true) {
//        print("Inside true")
//        10
//    } else {
//        20
//    }
//
//    print(value)

    // Arrays in Kotlin -> can be created using arrayOf function
//    val names = arrayOf("KT", "Shikhar", "Shubhansu")

//    names.forEach { print("$it ") }

    // Lists in Kotlin -> can be created using listOf function
//    By default, lists are immutable in Kotlin

//    val names = listOf("KT", "Shikhar", "Shubhansu")

//    Thus, values can't be changes once the list is created
//    names[0] = "TK"

//    print(names)

    // Mutable Lists in Kotlin -> can be created using mutableListOf function

//    val names = mutableListOf("KT", "Shikhar", "Shubhansu")

//    Here, values can be added, changed, removed even after the creation of the list
//    names[0] = "TK"

//    print(names)

//    We can add different types of values in the same list
//    val names = mutableListOf("KT", "Shikhar", 1, 23.56)

//    print(names)

    // Generic Lists in Kotlin

//    If you want to add only a particular type of value in the list, you can use Generics to specify the type
//    In the below given list, you can add only String values
//    val names = mutableListOf<String>("KT", "Shikhar")
//
//    print(names)

    // Functions

//    print(operations(2, 4))

//    greetings(name = "KT", greet = "GN")

    // Lambda Function      { a, b ->
    //        println("Adding these two numbers")
    //        a + b
    //    }
    // This is the lambda function which can be declared and defined inside another function
//    val output = operation(4, 5, { a, b ->
//        println("Adding these two numbers")
//        a + b
//    })
//
//    print(output)

    // filter and maps
//    filter -> used to filter out values in a single go using lambda function
//    map -> used to transform the list or set or anything to any form or data-type using lambda function

    val list = listOf<Int>(1, 2, 5, 8, 3)

    list.filter {
        it % 2 == 0
    }.map {
        it * it
    }.forEach {
        println("$it")
    }
}

//fun operations(a: Int, b: Int) : Int {
//    return a + b;
//}

//    Short hand for function declaration

//fun operations(a: Int, b: Int) : Int = a + b

//    In Kotlin, we can add a default value so if you don't pass anything to the function it will operate on the default value

//fun greetings(greet: String = "Good Morning", name: String) {
//    print("Hello $name, $greet")
//}

//    Functional Programming or Higher-Order Functions

//fun operation(a: Int, b: Int, operate: (Int, Int) -> Int) : Int {
//    return operate(a, b)
//}