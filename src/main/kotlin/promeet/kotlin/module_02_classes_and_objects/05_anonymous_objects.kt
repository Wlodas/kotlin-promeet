package promeet.kotlin.module_02_classes_and_objects

import com.fasterxml.jackson.core.util.DefaultIndenter
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter
import com.fasterxml.jackson.databind.ObjectMapper

private val jsonWriter = ObjectMapper().writer(
	DefaultPrettyPrinter().apply {
		indentObjectsWith(DefaultIndenter("\t", DefaultIndenter.SYS_LF))
		indentArraysWith(DefaultIndenter("\t", DefaultIndenter.SYS_LF))
	}
)

fun main(args: Array<String>) {
	val anonymousObject = object {
		val numberOne = 1
		val evenNumbers = (2..10 step 2).toList()
		val listOfNestedObjects = listOf(
			object {
				val nestedProperty1 = "nested1"
				val nestedProperty2 = "nested2"
			},
			object {
				val nestedProperty1 = "nested3"
				val nestedProperty2 = "nested4"
			}
		)
		
		fun someMethod() = println("platformMethod()")
	}
	
	anonymousObject.someMethod()
	
	jsonWriter.writeValue(System.out, anonymousObject)
}