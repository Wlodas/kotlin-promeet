package promeet.kotlin.module_03_functions

fun main(args: Array<String>) {
	fun sum1(a: Int, b: Int) = a + b
	
	// reference to declared function
	val reference1 = ::sum1
	println("2 + 2 = ${reference1(2, 2)}")
}