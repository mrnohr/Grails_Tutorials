package racetrack

class Registration {

	Boolean paid
	Date dateCreated //Note: this is a special name

	static constraints = {
		race()
		runner()
		paid()
		dateCreated()
	}
	
	static belongsTo = [race:Race, runner:Runner]
}
