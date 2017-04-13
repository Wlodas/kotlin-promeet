package promeet.kotlin.module_06_generics

sealed class Item {
	class Bottle : Item()
	class Can : Item()
}

private interface TrashBin<in T> {
	fun put(item: T): Int // we can only put items and nothing else
}

private fun demo(trashBin: TrashBin<Item>) {
	trashBin.put(Item.Bottle()) // just as in Java
	trashBin.put(Item.Can()) // just as in Java
	
	val trashBinForBottles: TrashBin<Item.Bottle> = trashBin
	trashBinForBottles.put(Item.Bottle())
//	trashBinForBottles.put(Item.Can()) // doesn't compile
}