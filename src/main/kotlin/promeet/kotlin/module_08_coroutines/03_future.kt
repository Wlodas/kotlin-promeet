package promeet.kotlin.module_08_coroutines

import com.google.common.math.IntMath.pow
import kotlinx.coroutines.experimental.future.await
import kotlinx.coroutines.experimental.future.future
import kotlinx.coroutines.experimental.runBlocking
import java.time.DayOfWeek
import java.util.*
import java.util.concurrent.CompletableFuture

private fun dictionary1() = List(10) { pow(it + 1, 2) }

private fun dictionary2() = EnumSet.allOf(DayOfWeek::class.java)

fun main(args: Array<String>) {
	runBlocking {
		val task1 = future { dictionary1() }
		val task2 = future { dictionary2() }
		
		mapOf(
			"dic1" to task1.await(),
			"dic2" to task2.await()
		)
	}.also(::println)
	
	run {
		val task1 = CompletableFuture.supplyAsync(::dictionary1)
		val task2 = CompletableFuture.supplyAsync(::dictionary2)
		
		task1.thenCombine(task2) { dic1, dic2 ->
			mapOf(
				"dic1" to dic1,
				"dic2" to dic2
			)
		}.join()
	}.also(::println)
}