package promeet.kotlin.module_01_basics

import java.time.DayOfWeek
import java.time.LocalDate

fun main(args: Array<String>) {
	for (n in 1..10) {
		print(n)
		print(" ")
	}
	println()
	
	for (n in 1 until 10) {
		print(n)
		print(" ")
	}
	println()
	
	for (n in 2..10 step 2) {
		print(n)
		print(" ")
	}
	println()
	
	for (n in 10 downTo 1) {
		print(n)
		print(" ")
	}
	println()
	
	for (n in (1..10).reversed()) {
		print(n)
		print(" ")
	}
	println()
	
	(1..10).joinToString(prefix = "[", postfix = "]").also(::println)
	
	if (LocalDate.now().dayOfWeek in DayOfWeek.MONDAY..DayOfWeek.FRIDAY) {
		println("Today is a working day.")
	} else {
		println("Today is not a working day.")
	}
	
	when (LocalDate.now().dayOfWeek) {
		in DayOfWeek.MONDAY..DayOfWeek.FRIDAY -> "Today is a working day."
		else -> "Today is not a working day."
	}.also(::println)
	
	if (LocalDate.now().dayOfWeek !in DayOfWeek.SATURDAY..DayOfWeek.SUNDAY) {
		println("Today is not a weekend.")
	} else {
		println("Today is a weekend.")
	}
}