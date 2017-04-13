package promeet.kotlin.module_05_collections

fun main(args: Array<String>) {
	// lists
	val immutableList = intListOf(1, 2, 3, 4)
	
	val mutableList = mutableListOf(1, 2, 3, 4)
	mutableList[0] = 0
	
	val arrayList = arrayListOf(1, 2, 3, 4)
	arrayList.trimToSize()
	
	// sets
	val immutableSet = setOf(1, 2, 3, 4)
	
	val mutableSet = mutableSetOf(1, 2, 3, 4)
	
	val hashSet = hashSetOf(1, 2, 3, 4)
	
	val linkedHashSet = linkedSetOf(1, 2, 3, 4)
	
	// maps
	val immutableMap = mapOf(1 to "1", 2 to "2")
	
	val mutableMap = mutableMapOf(1 to "1", 2 to "2")
	
	val hashMap = hashMapOf(1 to "1", 2 to "2")
	
	val linkedHashMap = linkedMapOf(1 to "1", 2 to "2")
}