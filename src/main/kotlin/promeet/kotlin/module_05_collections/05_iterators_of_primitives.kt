package promeet.kotlin.module_05_collections

import java.io.Serializable

class IntList internal constructor(private val elements: IntArray) : AbstractList<Int>(), RandomAccess, Serializable {
	override val size get() = elements.size
	
	override fun contains(element: Int) = element in elements
	
	override fun containsAll(elements: Collection<Int>) = elements.all { it in this.elements }
	
	override fun isEmpty() = elements.isEmpty()
	
	override fun iterator() = elements.iterator()
	
	override fun get(index: Int) = elements[index]
	
	override fun indexOf(element: Int) = elements.indexOf(element)
	
	override fun lastIndexOf(element: Int) = elements.lastIndexOf(element)
	
	override fun subList(fromIndex: Int, toIndex: Int) = IntList(elements.copyOfRange(fromIndex, toIndex))
	
	override fun hashCode() = elements.contentHashCode()
	
	override fun equals(other: Any?) = when {
		other === this -> true
		other is IntList -> elements.contentEquals(other.elements)
		other is List<*> && elements.size == other.size -> when (other) {
			is RandomAccess -> run {
				for (index in elements.indices) {
					val otherNext = other[index]
					if (otherNext !is Int || elements[index] != otherNext.toInt()) {
						return false
					}
				}
				return true
			}
			else -> run {
				val iterator = elements.iterator()
				val otherIterator = other.iterator()
				
				while (iterator.hasNext()) {
					val otherNext = otherIterator.next()
					if (otherNext !is Int || iterator.nextInt() != otherNext.toInt()) {
						return false
					}
				}
				return true
			}
		}
		else -> false
	}
	
	override fun toString() = elements.contentToString()
}

fun intListOf(vararg elements: Int) = IntList(elements)

fun main(args: Array<String>) {
	val list = listOf(1, 2, 3)
	for (element in list) {
		println(element)
	}
	
	val intList = intListOf(1, 2, 3)
	for (element in intList) {
		println(element)
	}
}