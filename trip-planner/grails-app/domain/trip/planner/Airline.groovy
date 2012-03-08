package trip.planner

class Airline {
	static hasMany = [flights:Flight]
	String name
	String iata
	String frequentFlier

	static constraints = {
		name(blank:false, maxSize:100)
		iata(blanke:true)
		frequentFlier(blank:true)
	}

	static mapping = {
		table 'some_other_table_name'
		columns {
			name column:'airline_name'
			iata column:'iata'
			frequentFlier column:'ff_id'
		}
	}

	String toString() {
		return name
	}
}
