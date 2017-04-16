package promeet.kotlin.module_02_classes_and_objects

private class Outer {
	private val property = "value"
	
	class Nested { // nested "static" class by default
		fun method() {
//			println(property) // doesn't compile
		}
	}
	
	inner class Inner {
		fun method() {
			println(property)
		}
	}
}