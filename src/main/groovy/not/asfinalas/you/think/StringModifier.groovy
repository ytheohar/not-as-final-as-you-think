package not.asfinalas.you.think

class StringModifier {

	def addMethod(String name) {
		String.metaClass."${name}" = { 'funny method: String.'+ name }
	}

	def overriddeStartsWith() {
		String.metaClass.startsWith = { String s -> true }
	}
}
