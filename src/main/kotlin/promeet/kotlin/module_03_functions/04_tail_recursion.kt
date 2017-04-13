package promeet.kotlin.module_03_functions

fun factorial1(n: Int): Int {
	tailrec fun _factorial1(n: Int, result: Int): Int = when {
		n > 1 -> _factorial1(n - 1, result * n)
		else -> result
	}
	return _factorial1(n, 1)
}

fun factorial2(n: Int): Int = _factorial2(n, 1)

private tailrec fun _factorial2(n: Int, result: Int): Int = when {
	n > 1 -> _factorial2(n - 1, result * n)
	else -> result
}

tailrec fun factorial3(n: Int, result: Int = 1): Int = when {
	n > 1 -> factorial3(n - 1, result * n)
	else -> result
}

fun main(args: Array<String>) {
	println(factorial1(3))
	println(factorial2(3))
	println(factorial3(3))
}