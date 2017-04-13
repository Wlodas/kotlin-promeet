package promeet.kotlin.module_05_collections

fun main(args: Array<String>) {
	val array = arrayOf(1, 2, 3, 4) // Integer[]
	println(array.contentToString())
	
	val arrayWithNulls = arrayOf(1, 2, 3, 4, null) // Integer[]
	println(arrayWithNulls.contentToString())
	
	val arrayWithOnlyNulls = arrayOfNulls<Int>(4) // Integer[]
	println(arrayWithOnlyNulls.contentToString())
	
	val intArray = intArrayOf(1, 2, 3, 4) // int[]
	println(intArray.contentToString())
	
	val intArray2 = IntArray(size = 4) { it + 1 } // functional initializer, 'it' here is a current array index
	println(intArray2.contentToString())
	
	val nestedArray = arrayOf(
		arrayOf(1, 2, 3),
		arrayOf(4, 5, 6),
		arrayOf(7, 8, 9)
	) // Integer[][]
	println(nestedArray.contentDeepToString())
}