package promeet.kotlin.module_06_generics

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue

private inline fun <reified T> isInstanceOfClass(obj: Any) = obj is T

private inline fun <reified T : Number> parseNumber(value: String): T? = when (T::class) {
	Int::class -> value.toIntOrNull() as T?
	Double::class -> value.toDoubleOrNull() as T?
	else -> null
}

fun main(args: Array<String>) {
	isInstanceOfClass<Int>(1234).also(::println) // is Int
	isInstanceOfClass<Int>("1234").also(::println) // is not Int
	
	val intNumber = parseNumber<Int>("007")
	println(intNumber)
	
	val doubleNumber : Double? = parseNumber("3.14")
	println(doubleNumber)
	
	// Jackson example
	jacksonObjectMapper().readValue<List<Int>>("[1, 2, 3, 4]").also(::println)
}