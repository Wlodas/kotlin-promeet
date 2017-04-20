package promeet.kotlin.module_03_functions

private const val FLAG = true

fun main(args: Array<String>) {
	val value1 = if (FLAG) 1 else 0 // alternative to ternary operator
	println(value1)
	
	val value2 = run { // equivalent of Java's local braces
		val a = 1
		val b = 2
		a + b // last expression is returned
	}
	println(value2)
//	println(a) // doesn't compile, out of the scope
	
	val value3 = when {
		FLAG -> 1
		else -> 0
	}
	
	val value4 = when (FLAG) {
		true -> 1
		false -> 0
		// or
//		else -> 0
	}
	
	val nullString : String? = null
	when (nullString) { // try this on Java's switch construct ;)
		"value" -> println("$nullString (length: ${nullString.length})")
		else -> println("is null")
	}
}