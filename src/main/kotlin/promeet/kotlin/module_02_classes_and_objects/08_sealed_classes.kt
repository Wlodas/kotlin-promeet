package promeet.kotlin.module_02_classes_and_objects

sealed class Option<out T> {
	data class Some<out T>(val value: T) : Option<T>()
	object None : Option<Nothing>()
}

// alternative syntax
sealed class Option2<out T>
data class Some<out T>(val value: T) : Option2<T>()
object None : Option2<Nothing>()

fun handleOption(option: Option<String>) = when (option) {
	is Option.Some -> println(option.value.length)
	Option.None -> println("<no value>")
	// 'else' branch is not required, because expression already covers all possible cases
}