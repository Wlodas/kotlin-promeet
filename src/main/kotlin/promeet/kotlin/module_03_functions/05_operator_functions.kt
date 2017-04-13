package promeet.kotlin.module_03_functions

private class MySet {
	operator fun contains(n: Int) = n == 1
}

fun main(args: Array<String>) {
	val numbers = setOf(1, 2, 3)
	if (1 in numbers) {
		println("Set contains number 1")
	}
	
	val mySet = MySet()
	if (1 in mySet) {
		println("MySet contains number 1")
	}
}