package promeet.kotlin.module_01_basics

fun main(args: Array<String>) {
	val value : Any = "1234"
	val nullableValue : Any? = null
	
	if (value is String) {
		println(value.length) // smart cast
	}
	
	if (value !is String) {
		return
	}
	println(value.length) // smart cast
	
	val string : String = nullableValue as String // cast exception if not String
	
	val intOrNull : Int? = value as Int? // cast exception if not Int nor null
	
	val possibleInt : Int? = value as? Int // Int or null if anything besides Int is being casted
}