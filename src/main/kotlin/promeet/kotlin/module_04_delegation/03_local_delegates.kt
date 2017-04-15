package promeet.kotlin.module_04_delegation

import java.math.BigDecimal

private const val someCondition1 = true

private const val someCondition2 = true

fun main(args: Array<String>) {
	val lazyValue by lazy(LazyThreadSafetyMode.NONE) { BigDecimal("3.14") }
	
	if (someCondition1) {
		println("branch 1:")
		println(lazyValue)
	}
	if (someCondition2) {
		println("branch 2:")
		println(lazyValue)
	}
}