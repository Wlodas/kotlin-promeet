package promeet.kotlin.module_03_functions

private class IntArrayContainer(vararg val numbers: Int)

fun main(args: Array<String>) {
	IntArrayContainer(1, 2, 3)
	
	val intArray = intArrayOf(1, 2, 3)
//	val container = IntArrayContainer(intArray) // doesn't compile
	val container = IntArrayContainer(*intArray) // require spread operator
	
	for ((index, number) in intArray.withIndex()) {
		intArray[index] = number * number
	}
	
	println(intArray.contentToString())
	println(container.numbers.contentToString())
}