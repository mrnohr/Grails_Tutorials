package racetrack



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(User)
class UserTests {

	void testSimpleConstraints() {
		mockForConstraintsTests(User)
		def user = new User(login:"someone",
				password:"blah",
				role:"SuperUser")
		// oops—role should be either 'admin' or 'user'
		// will the validation pick that up?
		assertFalse user.validate()
		assertEquals "inList", user.errors["role"]
	}
}
