package promeet.kotlin.module_04_delegation

import kotlin.properties.Delegates

private class DelegatingDTO(map: Map<String, Any?>) {
	val mapVal by map
	
	val lazyVal by lazy {
		println("heavy calculation...");
		"lazy value"
	}
	
	var observableVar by Delegates.observable("starting value") { _, oldValue, newValue ->
		println("changed value from '$oldValue' to '$newValue'")
	}
	
	var evenNumber by Delegates.vetoable(0) { _, _, newValue ->
		if (newValue % 2 != 0) {
			println("$newValue is not an even number")
			false
		} else {
			true
		}
	}
}

fun main(args: Array<String>) {
	val dto = DelegatingDTO(mapOf("mapVal" to "value from the map"))
	
	println(dto.mapVal)
	
	println(dto.lazyVal)
	println(dto.lazyVal)
	
	println(dto.observableVar)
	dto.observableVar = "new value"
	println(dto.observableVar)
	
	println(dto.evenNumber)
	dto.evenNumber = 2
	println(dto.evenNumber)
	dto.evenNumber = 3
	println(dto.evenNumber)
}