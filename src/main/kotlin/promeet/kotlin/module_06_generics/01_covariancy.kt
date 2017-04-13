package promeet.kotlin.module_06_generics

private interface MyIterable<out T> {
	fun next(): T
}

private fun demo(itr: MyIterable<String>) {
	val objects: MyIterable<Any> = itr // OK, since T is an out-parameter
}