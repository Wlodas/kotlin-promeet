package promeet.kotlin.module_03_functions

import java.math.BigInteger

private inline fun Int.toBigInteger(): BigInteger = BigInteger.valueOf(this.toLong())

private inline fun <T : Any> mySynchronized(mutex: T, body: T.() -> Unit) {
	synchronized(mutex) {
		mutex.body()
		// or
//		body(mutex)
	}
}

fun main(args: Array<String>) {
	val bigInt = 100.toBigInteger()
	println("$bigInt (${bigInt.javaClass.name})")
	
	mySynchronized(listOf(1, 2, 3, 4)) {
		/* this. */ forEach(::println)
	}
}