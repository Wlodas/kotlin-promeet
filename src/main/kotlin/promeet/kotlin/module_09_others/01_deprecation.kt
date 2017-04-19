package promeet.kotlin.module_09_others

@Deprecated("Use string.joinToString(separator)", ReplaceWith("strings.joinToString(separator)"))
private fun join1(strings: List<String>, separator: String) {}

@Deprecated("Use string.joinToString(separator)", ReplaceWith("strings.joinToString(separator)"), DeprecationLevel.ERROR)
private fun join2(strings: List<String>, separator: String) {}

@Deprecated("Use string.joinToString(separator)", ReplaceWith("strings.joinToString(separator)"), DeprecationLevel.HIDDEN)
private fun join3(strings: List<String>, separator: String) {}

@Deprecated("Use Strings.repeat(string, count)", ReplaceWith("Strings.repeat(string, count)", "com.google.common.base.Strings"))
fun myRepeat(string: String, count: Int) = string.repeat(count)

fun main(args: Array<String>) {
	join1(listOf("1", "2", "3"), ",") // classic warning
//	join2(listOf("1", "2", "3"), ",") // error, doesn't compile
//	join3(listOf("1", "2", "3"), ",") // unresolved reference, doesn't compile
	myRepeat("a", 3)
}