package promeet.kotlin.module_05_collections

fun main(args: Array<String>) {
	// lists
	val immutableList = listOf(1, 2, 3, 4)
	
	val mutableList = mutableListOf(1, 2, 3, 4)
	
	val arrayList = arrayListOf(1, 2, 3, 4)
	
	val emptyList = emptyList<Int>() // shortcut for listOf<Int>()
	
	// sets
	val immutableSet = setOf(1, 2, 3, 4)
	
	val mutableSet = mutableSetOf(1, 2, 3, 4)
	
	val hashSet = hashSetOf(1, 2, 3, 4)
	
	val linkedHashSet = linkedSetOf(1, 2, 3, 4)
	
	val sortedSet = sortedSetOf(1, 2, 3, 4)
	
	val emptySet = emptySet<Int>() // shortcut for setOf<Int>()
	
	// maps
	val immutableMap = mapOf(1 to "1", 2 to "2")
	
	val mutableMap = mutableMapOf(1 to "1", 2 to "2")
	
	val hashMap = hashMapOf(1 to "1", 2 to "2")
	
	val linkedHashMap = linkedMapOf(1 to "1", 2 to "2")
	
	val sortedMap = sortedMapOf(1 to "1", 2 to "2")
	
	val emptyMap = emptyMap<Int, String>() // shortcut for mapOf<Int, String>()
}