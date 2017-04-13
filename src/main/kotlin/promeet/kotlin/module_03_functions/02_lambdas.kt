package promeet.kotlin.module_03_functions

fun main(args: Array<String>) {
	// implicit function type
	val sum1 = { a: Int, b: Int -> a + b }
	sum1(2, 2)
	// or
	sum1.invoke(2, 2)
	
	// explicit function type
	val sum2: (Int, Int) -> Int = { a, b -> a + b }
	
	// function interface
	val sum3: Function2<Int, Int, Int> = { a, b -> a + b }
	
	// passing functions as parameter
	listOf(1, 2, 3).filter({ n: Int -> n % 2 == 0 })
	
	listOf(1, 2, 3).filter { n: Int -> n % 2 == 0 }
	
	listOf(1, 2, 3).filter { n -> n % 2 == 0 }
	
	listOf(1, 2, 3).filter { it % 2 == 0 } // implicit function parameter 'it', equivalent of Groovy's 'it or 'Scala's '_'
	
	fun isEven(n: Int) = n % 2 == 0
	
	listOf(1, 2, 3).filter(::isEven) // passing declared function as reference
}