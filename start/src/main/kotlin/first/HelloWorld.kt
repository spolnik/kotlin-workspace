package first

data class Person(val name: String, val age: Int? = null)

fun main(args: Array<String>) {
    val people = listOf(Person("Mikolaj", 3), Person("Julia", 7), Person("Madzia", 27), Person("Jacek"))
    val oldest = people.maxBy { it.age ?: 0 }
    println("The oldest is: $oldest")

    println(sum(3, 4))
}


fun sum(a: Int, b: Int): Int {
    return a + b
}