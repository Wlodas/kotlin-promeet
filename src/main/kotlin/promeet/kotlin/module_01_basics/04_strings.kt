package promeet.kotlin.module_01_basics

fun main(args: Array<String>) {
	val stringValue = "abcd"
	
	// string template
	println("String '$stringValue' has length ${stringValue.length}")
	
	// multiline string
	val queryString = """
		SELECT * FROM Company c
		JOIN FETCH c.employees
		WHERE c.id = :id
	"""
	println()
	println(queryString.trimIndent())
}