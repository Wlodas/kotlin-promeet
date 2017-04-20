package promeet.kotlin.module_05_collections

fun main(args: Array<String>) {
	val numbers = (1..10)
	
	val evenNumbers = numbers.asSequence().filter { // evaluated later
		if (it % 2 == 0) {
			println(it)
			true
		} else {
			false
		}
	}
	println(evenNumbers.toList())
	println(evenNumbers.toList())
	
	// constrain sequence to one time iteration, similarly to Java's Stream<T>
	val oneTimeUsageSequence = evenNumbers.constrainOnce()
	
	println(oneTimeUsageSequence.toList())
	try {
		println(oneTimeUsageSequence.toList())
	} catch (e: IllegalStateException) {
		println(e.message)
	}
	
	// generate sequence
	val numbersFromOneToTen = generateSequence(seed = 1) { it + 1 }.take(10)
	println(numbersFromOneToTen.toList())
	
	// more sophisticated generation method will be shown in coroutines module ;)
}