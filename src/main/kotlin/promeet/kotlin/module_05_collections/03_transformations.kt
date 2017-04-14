package promeet.kotlin.module_05_collections

fun main(args: Array<String>) {
	val mixedList = listOf(1, 2, 3, null, "some string", "another string")
	println(mixedList)
	
	val nullSafeList = mixedList.filterNotNull()
	println(nullSafeList)
	
	val numbersList = mixedList.filterIsInstance<Int>()
	println(numbersList)
	
	val nullableNumbersList = mixedList.filterIsInstance<Int?>() // retains Ints and nulls :)
	println(nullableNumbersList)
	
	val poweredNumbersList = numbersList.map { it * it }
	println(poweredNumbersList)
	
	val numbersArray = numbersList.toTypedArray() //== list.toArray(new Integer[list.size()]) :)
	println("${numbersArray.contentToString()} - ${numbersArray.javaClass.canonicalName}")
	
	val numbersIntArray = numbersList.toIntArray() // additional method for Collection<Int>
	println("${numbersIntArray.contentToString()} - ${numbersIntArray.javaClass.canonicalName}")
}