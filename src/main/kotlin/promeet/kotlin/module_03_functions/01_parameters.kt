package promeet.kotlin.module_03_functions

//@JvmOverloads // creates 2 overloaded methods from Java perspective
private fun formatNumber(number: Double, decimalDigits: Int = 2) = "%.${decimalDigits}f".format(number)

fun main(args: Array<String>) {
	// default parameter value
	formatNumber(1.234).also(::println)
	
	// explicit parameter value
	formatNumber(1.234, 3).also(::println)
	
	// named parameter
	formatNumber(1.234, decimalDigits = 1).also(::println)
	
	// named parameters in any order
	formatNumber(decimalDigits = 0, number = 1.234).also(::println)
	
	// local function visible only in this method
	fun localSumFunction(a: Int, b: Int) = a + b
	
	localSumFunction(2, 2).also(::println)
}