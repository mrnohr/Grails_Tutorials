package trip.planner

class Flight {
	static belongsTo = [trip:Trip, airline:Airline]

	String flightNumber
	Date departureDate
	Airport departureAirport
	Date arrivalDate
	Airport arrivalAirport

	static constraints = {
	}
}
