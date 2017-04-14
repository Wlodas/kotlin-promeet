package promeet.kotlin.module_04_delegation

import java.beans.PropertyChangeSupport
import kotlin.properties.Delegates
import kotlin.properties.ObservableProperty
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

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

private fun <T> PropertyChangeSupport.createProperty(initialValue: T): ReadWriteProperty<Any?, T> {
	return object : ObservableProperty<T>(initialValue) {
		override fun afterChange(property: KProperty<*>, oldValue: T, newValue: T) {
			this@createProperty.firePropertyChange(property.name, oldValue, newValue)
		}
	}
}

private class ActiveModelDTO {
	val propertyChangeSupport = PropertyChangeSupport(this)
	
	var property1: String by propertyChangeSupport.createProperty("initial String")
	
	var property2: Int? by propertyChangeSupport.createProperty(null)
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
	
	val activeModelDTO = ActiveModelDTO()
	activeModelDTO.propertyChangeSupport.addPropertyChangeListener { event ->
		println("Property '${event.propertyName}' changed value from '${event.oldValue}' to '${event.newValue}'.")
	}
	activeModelDTO.property1 = "new string"
	activeModelDTO.property2 = 1
}