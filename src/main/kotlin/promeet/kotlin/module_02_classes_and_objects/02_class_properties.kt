package promeet.kotlin.module_02_classes_and_objects

private class DTOWithProperties {
	val property = "value"
	
	var mutableProperty = "default value"
	
	var virtualMutableProperty: String
		get() = mutableProperty
		set(value) {
			mutableProperty = value
		}
	
	lateinit var lateInitValue: String
}

fun main(args: Array<String>) {
	val dto = DTOWithProperties()
	
	// immutable  property
	println(DTOWithProperties::property.name + ":")
	println(dto.property)
	
	// mutable property
	println()
	println(DTOWithProperties::mutableProperty.name + ":")
	println(dto.mutableProperty)
	dto.mutableProperty = "new value"
	println(dto.mutableProperty)
	
	// virtual property
	println()
	println(DTOWithProperties::virtualMutableProperty.name + ":")
	println(dto.virtualMutableProperty)
	dto.virtualMutableProperty = "new value 2"
	println(dto.mutableProperty)
	
	// lateinit property
	println()
	println(DTOWithProperties::lateInitValue.name + ":")
	try {
		dto.lateInitValue
	} catch (e: UninitializedPropertyAccessException) {
		println(e.message)
	}
	dto.lateInitValue = "set value"
	println(dto.lateInitValue)
//	dto.lateInitValue = null // doesn't compile
}