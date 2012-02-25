package org.example

class Person {
	String username
	String realName
	
    static hasMany = [posts : Status]
	
	static constraints = {
		username blank: false, unique: true
		realName blank: false
	}
}
