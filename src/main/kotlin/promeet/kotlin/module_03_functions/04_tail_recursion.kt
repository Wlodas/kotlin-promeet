package promeet.kotlin.module_03_functions

fun factorial1(n: Int): Int {
	tailrec fun _factorial1(n: Int, result: Int = 1): Int = when {
		n > 1 -> _factorial1(n - 1, result * n)
		else -> result
	}
	return _factorial1(n)
}

fun factorial2(n: Int): Int = _factorial2(n)

private tailrec fun _factorial2(n: Int, result: Int = 1): Int = when {
	n > 1 -> _factorial2(n - 1, result * n)
	else -> result
}

tailrec fun factorial3(n: Int, result: Int = 1): Int = when {
	n > 1 -> factorial3(n - 1, result * n)
	else -> result
}

// unfortunately inlining of tail recursive functions is not yet supported
//fun factorial4(n: Int): Int {
//	inline tailrec fun _factorial4(n: Int, result: Int = 1): Int = when {
//		n > 1 -> _factorial4(n - 1, result * n)
//		else -> result
//	}
//	return _factorial4(n)
//}

fun main(args: Array<String>) {
	println(factorial1(3)) // recommended by me
	println(factorial2(3)) // second best option, currently the best one performance wise
	println(factorial3(3)) // looks normally, but I wouldn't recommend this one
//	println(factorial3(3, -1000)) // you could hack the function this way from another module ;)
}