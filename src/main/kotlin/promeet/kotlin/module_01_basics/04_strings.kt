package promeet.kotlin.module_01_basics

fun main(args: Array<String>) {
	val stringValue = "abcd"
	
	// string template
	println("String '$stringValue' has length ${stringValue.length}") // evaluated eagerly
	// if you wanted to get Groovy' GString-like behaviour in Kotlin you could use lazy delegate
	
	// multiline string
	println()
	println("""
		SELECT * FROM Company c
		JOIN FETCH c.employees
		WHERE c.id = :id
	""".trimIndent())
	
	// alternative way
	println()
	println("""
		|SELECT * FROM Company c
		|JOIN FETCH c.employees
		|WHERE c.id = :id
	""".trimMargin())
}