package racetrack

class Runner {

	String firstName
	String lastName
	Date dateOfBirth
	String gender
	String address
	String city
	String state
	String zipcode
	String email

	static constraints = {
		firstName(blank:false)
		lastName(blank:false)
		dateOfBirth()
		gender(inList:["M", "F"])
		address()
		city()
		state()
		zipcode()
		email(email:true)
	}

	static hasMany = [registrations:Registration]

	String toString(){
		"${lastName}, ${firstName} (${email})"
	}
}
