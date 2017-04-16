package promeet.kotlin.module_03_functions

private class IntArrayContainer(vararg private val numbers: Int) {
	override fun toString() = numbers.contentToString()
}

fun main(args: Array<String>) {
	IntArrayContainer(1, 2, 3)
	
	val intArray = intArrayOf(1, 2, 3)
//	val container = IntArrayContainer(intArray) // doesn't compile
	val container = IntArrayContainer(*intArray) // required spread operator
	
	for ((index, number) in intArray.withIndex()) {
		intArray[index] = number * number
	}
	
	println(intArray.contentToString())
	println(container)
}