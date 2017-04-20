package promeet.kotlin.module_04_delegation

import java.beans.PropertyChangeSupport
import kotlin.properties.ObservableProperty
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

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
	val activeModelDTO = ActiveModelDTO()
	activeModelDTO.propertyChangeSupport.addPropertyChangeListener { event ->
		println("Property '${event.propertyName}' changed value from '${event.oldValue}' to '${event.newValue}'.")
	}
	activeModelDTO.property1 = "new string"
	activeModelDTO.property2 = 1
}