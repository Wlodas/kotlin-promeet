package promeet.kotlin.module_01_basics

fun main(args: Array<String>) {
	val inferedString = "abcd"
	
	val explicitString : String = "abcd" // same as above
	
	val nullValue = null // type unknown
		
//	val nullStringValue : String = null // doesn't compile
	
	val nullableString : String? = null
	
	val nullableString2 : String? = "abcd"
	
	val nullableStringLength = nullableString!!.length // NPE in runtime
}