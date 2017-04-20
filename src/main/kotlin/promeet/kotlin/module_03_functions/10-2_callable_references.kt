package promeet.kotlin.module_03_functions

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
	
	// class function reference
	val method = Purse::plusAssign
	method(purse, .10f) // 1.60
	println(purse)
	
	// bound object function reference
	val instanceMethod = purse::plusAssign
	instanceMethod(.10f) // 1.70
	println(purse)
	
	// class property reference
	val property = Purse::amount
	property.set(purse, property.get(purse) + .30f) // 2.00
	// or:
	// property.set(purse, property(purse) + .30f) // 2.00
	println(purse)
	
	// bound object property reference
	val instanceProperty = purse::amount
	instanceProperty.set(instanceProperty.get() - 1.50f) // 0.50
	// or:
	// instanceProperty.set(instanceProperty() - 1.50f) // 0.50
	println(purse)
}