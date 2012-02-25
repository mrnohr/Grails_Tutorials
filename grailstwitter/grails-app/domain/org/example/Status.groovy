package org.example

class Status {
	String message
	Date dateCreated
	
	static belongsTo = [author: Person]
    
	static constraints = {
		message blank: false, maxSize: 140
    }
}
