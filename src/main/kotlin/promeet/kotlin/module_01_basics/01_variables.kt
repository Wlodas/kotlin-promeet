package promeet.kotlin.module_01_basics

fun main(args: Array<String>) {
	run {
		val a = 1
		val b = 2
		val c = a + b
		println(c)
	}
	
	run {
		val a = 1.0
		val b = 2
		val c = a + b
		println(c)
	}
	
	run {
		val a = 1.0
		val b = 2
		val c : Int = a.toInt() + b
		println(c)
	}
	
	run {
		var i = 0
		i++
		println(i)
	}
}