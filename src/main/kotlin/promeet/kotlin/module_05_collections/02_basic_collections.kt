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
	
	// basic operations on mutable lists
	val tempList = mutableListOf(1, 2, 3, 4) // [1, 2, 3, 4]
	tempList += 5 // [1, 2, 3, 4, 5]
	tempList -= 2 // [1, 3, 4, 5]
	tempList.removeAt(index = 0) // [3, 4, 5]
	tempList.remove(element = 3) // [4, 5]
	tempList[1] = 6 // [4, 6]
	
	println(tempList)
	println("First element: ${tempList[0]}")
	println("First element: ${tempList.first()}")
	println("First element: ${tempList.firstOrNull()}") // safe way
	
	// basic operations on mutable maps
	val tempMap = sortedMapOf<Int, String>()
	tempMap[1] = "one" // {1 -> "one"}
	tempMap[2] = "two" // {1 -> "one", 2 -> "two"}
	tempMap -= 1 // {2 -> "two"}
	tempMap += 0 to "zero" // {0 -> "zero", 2 -> "two"}
	
	println(tempMap)
	for ((key, value) in tempMap) {
		println("$key -> $value")
	}
	
	// example mathematical operations on sets
	val setA = setOf(1, 2, 3)
	val setB = setOf(2, 3, 4)
	
	println("Union: ${setA + setB}") // actually sums 2 sets
	println("Union 2: ${setA.union(setB)}") // works with any Iterable type
	println("Intersection: ${setA.intersect(setB)}") // works with any Iterable type
	println("Complement of B in A: ${setA - setB}")
}