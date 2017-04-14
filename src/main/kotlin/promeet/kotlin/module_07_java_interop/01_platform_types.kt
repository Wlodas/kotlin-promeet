package promeet.kotlin.module_07_java_interop

fun main(args: Array<String>) {
	val unknownValue = SomeJavaClass().platformMethod()
	
//	println(unknownValue.length) // NPE exception in runtime
	if (unknownValue != null) {
		println(unknownValue.length)
	}
	
//	val nullableValue = SomeJavaClass().annotatedMethod(null, "notnull") // doesn't compile
	val nullableValue = SomeJavaClass().annotatedMethod("text", "notnull")

//	println(nullableValue.length) // doesn't compile
	if (nullableValue != null) {
		println(nullableValue.length)
	}
}