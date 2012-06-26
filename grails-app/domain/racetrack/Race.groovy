package racetrack

class Race {
	String name
	Date startDate
	String city
	String state
	BigDecimal distance
	BigDecimal cost
	Integer maxRunners

	static constraints = {
		name (blank:false, maxSize:20)
		state (inList:["GA", "NC", "PO"])
		maxRunners (min:1, max:100000)
		startDate (validator:{return (it > new Date())})
	}
	
	BigDecimal inMiles(){
		return distance * 0.6214
	}
	
	static hasMany = [registrations:Registration]

}
