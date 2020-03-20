class Person (val firstName: String = "Stefan", val lastName: String = "Novak") {

    var nickName: String? = null
        set(value) {
            field = value
            println("The new nickname is $value")
        }

        get() {
            println("The returned value is $field")
            return field
        }

    fun printInfo() {
        // ?: replaces (if not null, print name, else print so so message.
        val nickNameToPrint = nickName ?: "no nickname"
        println("First name: $firstName, Last name: $lastName, Nickname: $nickNameToPrint")
    }
}