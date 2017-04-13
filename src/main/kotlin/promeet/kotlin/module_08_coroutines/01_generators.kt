package promeet.kotlin.module_08_coroutines

import kotlin.coroutines.experimental.buildSequence

fun main(args: Array<String>) {
	val primeNumbersGenerator = buildSequence {
		for (i in 1..Integer.MAX_VALUE) {
			var counter = 0
			var num = i
			while (num >= 1) {
				if (i % num == 0) {
					counter++
				}
				num--
			}
			if (counter == 2) {
				yield(i)
			}
		}
	}
	primeNumbersGenerator.take(10).joinToString().also(::println)
}