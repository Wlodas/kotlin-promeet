package promeet.kotlin.module_02_classes_and_objects

private class NormalPersonDTO(val firstName: String, val lastName: String)

private data class DataClassPersonDTO(val firstName: String, val lastName: String)

fun main(args: Array<String>) {
	val normalPerson1 = NormalPersonDTO("John", "Smith")
	val normalPerson2 = NormalPersonDTO("John", "Smith")
	
	println(normalPerson1)
	println(normalPerson1 == normalPerson2)
	
	val dataClassPerson1 = DataClassPersonDTO("John", "Smith")
	val dataClassPerson2 = DataClassPersonDTO("John", "Smith")
	
	println(dataClassPerson1)
	println(dataClassPerson1 == dataClassPerson2)
	
	// additionally
	val (firstName, lastName) = dataClassPerson1 // tuple like syntax, similarly to Scala
	println(firstName)
	println(lastName)
	
	val clonedPerson = dataClassPerson1.copy(lastName = "Tanaka") // modify only selected properties for the new object
	println(clonedPerson)
}