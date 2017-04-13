package promeet.kotlin.module_01_basics

fun main(args: Array<String>) {
	val int1 = 1_000
	val int2 = 1_000
	val optionalInt1 : Int? = 1_000
	val optionalInt2 : Int? = 1_000
	val optionalInt3 : Int? = null
	
	println(int1 == int2)
	println(int1 == optionalInt1)
	println(optionalInt1 == optionalInt2)
	println(optionalInt1 !== optionalInt2)
	println(optionalInt1 != optionalInt3)
}