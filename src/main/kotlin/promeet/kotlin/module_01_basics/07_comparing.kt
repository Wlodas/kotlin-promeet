package promeet.kotlin.module_01_basics

import java.time.LocalDate
import java.time.Month

fun main(args: Array<String>) {
	val date1 = LocalDate.of(2000, Month.JANUARY, 1)
	val date2 = LocalDate.of(2000, Month.JANUARY, 2)
	
	if (date1 < date2) {
		println("First date is earlier compared to second one.")
	}
}