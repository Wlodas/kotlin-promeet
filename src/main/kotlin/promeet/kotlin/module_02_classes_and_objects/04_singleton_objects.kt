package promeet.kotlin.module_02_classes_and_objects

private object StandaloneObject {
	fun someService() = println("StandaloneObject")
}

private class ParentClass {
	private companion object /* optional class name */ {
		private const val BYTES_PER_MEGABYTE = 1024 * 1024
	}
	
	fun megaBytesToBytes(megaBytes: Int) = BYTES_PER_MEGABYTE * megaBytes
}

private interface Factory<T> {
	fun create(): T
}

private class MyClass private constructor() {
	companion object : Factory<MyClass> {
		override fun create(): MyClass = MyClass()
	}
}

fun main(args: Array<String>) {
	StandaloneObject.someService()
	
	println(ParentClass().megaBytesToBytes(megaBytes = 1))
	
	MyClass.create()
}