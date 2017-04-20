package promeet.kotlin.module_06_generics

@JvmName("handleInts")
private fun handle(list: List<Int>) {
	println("handleInts")
}

@JvmName("handleStrings")
private fun handle(list: List<String>) {
	println("handleStrings")
}

fun main(args: Array<String>) {
	handle(listOf(1, 2, 3))
	handle(listOf("1", "2", "3"))
}