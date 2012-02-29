package trip.planner

class Airline {
	String name
	String url
	String frequentFlyer
	String notes

	static hasMany = [trip:Trip]

	static constraints = {
		name(blank:false, maxSize:100)
		url(url:true)
		frequentFlyer(blank:true)
		notes(maxSize:1500)
	}
	
	static mapping = {
		table 'some_other_table_name'
		columns {
		  name column:'airline_name'
		  url column:'link'
		  frequentFlyer column:'ff_id'
		}
	  }

	String toString() {
		return name
	}
}
