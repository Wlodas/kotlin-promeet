package promeet.kotlin.module_06_generics

sealed class Item {
	class Bottle : Item()
	class Can : Item()
}

private interface TrashBin<in T> {
	fun put(item: T): Int
}

private fun demo(trashBin: TrashBin<Item>) {
	trashBin.put(Item.Bottle())
	trashBin.put(Item.Can())
	
	val trashBinForBottles: TrashBin<Item.Bottle> = trashBin
	trashBinForBottles.put(Item.Bottle())
//	trashBinForBottles.put(Item.Can()) // doesn't compile
}