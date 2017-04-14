package promeet.kotlin.module_06_generics

private interface MyIterator<out T> {
	fun next(): T
}

private fun demo(stringIterator: MyIterator<String>) {
	val nextString = stringIterator.next()
	
	val anyIterator: MyIterator<Any> = stringIterator // OK, since T is an out-parameter
	val nextAnyElement = anyIterator.next()
}