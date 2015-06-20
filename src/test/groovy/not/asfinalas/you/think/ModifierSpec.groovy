package not.asfinalas.you.think

import spock.lang.*

class ModifierSpec extends Specification {

	@Unroll
	def 'add myMethod to String class #name' () {
		given:
		def s = 'abc'
		def m = new StringModifier();

		when:
		m.addMethod(name)

		then:
		s."${name}"() == returnValue

		where:
		name || returnValue
		'myMethod'|| 'funny method: String.myMethod'
		'foo' || 'funny method: String.foo'
		'boo' || 'funny method: String.boo'
	}


	def 'ovveride startsWith to always return true' () {
		given:
		def s = 'abc'
		def m = new StringModifier();

		when:
		m.overriddeStartsWith()

		then:
		s.startsWith('gdhfdh')
	}
}
