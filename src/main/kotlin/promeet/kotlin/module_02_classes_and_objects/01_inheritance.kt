package promeet.kotlin.module_02_classes_and_objects

private class FinalClass // final by default

//private class ExtendingClass : FinalClass // doesn't compile

private open class OpenClass {
	fun normalMethod() = println("OpenClass::normalMethod")
	
	open fun openMethod() = println("OpenClass::openMethod")
	
	protected open fun openMethod2() = println("OpenClass::openMethod2")
}

private open class OpenExtendingClass : OpenClass() {
//	override fun normalMethod() = println("FinalExtendingClass::normalMethod") // doesn't compile
	
	override final fun openMethod() = println("OpenExtendingClass::openMethod") // method is final
	
	override fun openMethod2() = println("OpenExtendingClass::openMethod2") // method is still open and protected
}

private class FinalExtendingClass : OpenExtendingClass() {
//	override fun openMethod() = println("FinalExtendingClass::openMethod") // doesn't compile
	
//	fun openMethod2() = println("FinalExtendingClass::openMethod2") // doesn't compile, requires 'override' keyword
}