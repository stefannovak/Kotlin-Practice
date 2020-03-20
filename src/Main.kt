fun sayHello(greeting:String, itemsToGreet:List<String>) {
    itemsToGreet.forEach { itemToGreet ->
        println("$greeting $itemToGreet")
    }
}

fun main() {

    val person = Person()
//    person.firstName
//    person.lastName
//    person.nickName = "Shades"
//    person.nickName = "New Nickname"
//    println(person.nickName)
    person.printInfo()

//    val interestingThingsArray = arrayOf("Kotlin", "Programming", "Comic Books")
//    val interestingThingsList = listOf("Kotlin", "Programming", "Comic Books")
//    val interestingThingsMap = mutableMapOf(1 to "a", 2 to "b", 3 to "c")
    //mutable = can add values etc
    //immutable = no modification
//    interestingThingsMap.put(4, "d")
//
//    sayHello("Hi", interestingThingsList)

//    println(interestingThings.size)
//    println(interestingThings[0])
//    println(interestingThings.get(2))

    //iterates the whole array
//    interestingThings.forEach {interestingThing ->
////        println(interestingThing)
////    }

    //lists array with corresponding index
//    interestingThings.forEachIndexed { index, interestingThing ->
//        println("$interestingThing is at index $index")
//    }

//    interestingThingsList.forEach { interestingThing ->
//        println(interestingThing)
//    }

//    interestingThingsMap.forEach{key, value -> println("$key -> $value")}
}