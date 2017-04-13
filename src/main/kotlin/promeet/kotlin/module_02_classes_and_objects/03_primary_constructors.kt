package promeet.kotlin.module_02_classes_and_objects

private class Person(val firstName: String, var lastName: String)

fun main(args: Array<String>) {
	val person = Person("John", "Smith")
	println("${person.firstName} ${person.lastName}")
	
	person.lastName = "Tanaka"
	println("${person.firstName} ${person.lastName}")
}