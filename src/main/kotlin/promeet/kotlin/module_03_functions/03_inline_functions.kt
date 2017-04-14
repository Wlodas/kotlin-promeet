package promeet.kotlin.module_03_functions

private fun normalFunction(function: () -> Unit) = function()

private inline fun inlineFunction(function: () -> Unit) = function()

private inline fun crossInlineFunction(crossinline function: () -> Unit) = Runnable { function() }.run()

// inlining doesn't improve performance too much without any function parameters to inline
private inline fun inlineFunctionWithNoInline(noinline function: () -> Unit) = function()

fun main(args: Array<String>) {
	normalFunction { println("normal") }
	inlineFunction { println("inline") }
	crossInlineFunction { println("crossinline") }
	inlineFunctionWithNoInline { println("noinline") }
}