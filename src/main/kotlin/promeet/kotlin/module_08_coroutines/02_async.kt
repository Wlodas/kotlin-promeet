package promeet.kotlin.module_08_coroutines

import kotlinx.coroutines.experimental.CommonPool
import kotlinx.coroutines.experimental.CoroutineDispatcher
import kotlinx.coroutines.experimental.async
import kotlinx.coroutines.experimental.runBlocking
import java.math.BigDecimal
import java.util.concurrent.Executors
import kotlin.coroutines.experimental.CoroutineContext

private class ForkJoinPool : CoroutineDispatcher(), AutoCloseable {
	private val pool = Executors.newWorkStealingPool()
	
	override fun dispatch(context: CoroutineContext, block: Runnable) = pool.execute(block)
	
	override fun close() = pool.shutdown()
}

fun main(args: Array<String>) {
	runBlocking {
		val task1 = async(CommonPool) { BigDecimal("1234.5678") }
		val task2 = async(CommonPool) { BigDecimal("8765.4321") }
		
		task1.await() + task2.await()
	}.also(::println)
	
	runBlocking {
		ForkJoinPool().use { pool ->
			val task1 = async(pool) { BigDecimal("1234.5678") }
			val task2 = async(pool) { BigDecimal("8765.4321") }
			
			task1.await() + task2.await()
		}
	}.also(::println)
}