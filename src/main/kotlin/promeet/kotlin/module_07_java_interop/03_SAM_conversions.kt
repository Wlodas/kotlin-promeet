package promeet.kotlin.module_07_java_interop

import java.util.stream.Collectors

fun main(args: Array<String>) {
	val runnable = Runnable { println("runnable singleton") }
	runnable.run()
	
	val evenNumbers = (1..10).toList()
		.stream()
		.filter { it % 2 == 0 } // Predicate<Int!>
		.collect(Collectors.toList())
	
	println(evenNumbers)
}