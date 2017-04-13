package promeet.kotlin.module_04_delegation

private class Purse(var amount: Float) {
	operator fun plusAssign(amount: Float) {
		this.amount += amount
	}
	
	override fun toString() = "%.2f".format(amount)
}

fun main(args: Array<String>) {
	val purse = Purse(1.00f)
	println(purse)
	
	purse += .50f
	println(purse) // 1.50
	
	val method = Purse::plusAssign
	method(purse, .10f) // 1.60
	println(purse)
	
	val instanceMethod = purse::plusAssign
	instanceMethod(.10f) // 1.70
	println(purse)
	
	val property = Purse::amount
	property.set(purse, property.get(purse) + .30f) // 2.00
	// or:
	// property.set(purse, property(purse) + .30f) // 2.00
	println(purse)
	
	val instanceProperty = purse::amount
	instanceProperty.set(instanceProperty.get() - 1.50f) // 0.50
	// or:
	// instanceProperty.set(instanceProperty() - 1.50f) // 0.50
	println(purse)
}