package promeet.kotlin.module_04_delegation

private interface Service {
	fun serviceMethod()
}

private class ServiceImpl : Service {
	override fun serviceMethod() = System.out.println("ServiceImpl.serviceMethod()")
}

private class ServiceDecorator(delegate: Service) : Service by delegate

fun main(args: Array<String>) {
	val service = ServiceDecorator(ServiceImpl())
	service.serviceMethod()
}