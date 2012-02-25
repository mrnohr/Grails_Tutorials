package org.example

class StatusController {
	static scaffold = Status
	
	def index = {
		return [statusMessages: Status.list(max: 10, sort: 'dateCreated', order: 'desc')]
	}
}
