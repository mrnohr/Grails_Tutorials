package trip.planner



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.web.GroovyPageUnitTestMixin} for usage instructions
 */
@TestFor(DateTagLib)
class DateTagLibTests {

	void testThisYear() {
		def dateTagLib = new DateTagLib()
		String expected = Calendar.getInstance().get(Calendar.YEAR)
		assertEquals("the years don't match", expected, dateTagLib.thisYear().toString())
	}
}
