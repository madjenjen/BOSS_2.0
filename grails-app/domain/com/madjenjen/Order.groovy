package com.madjenjen

class Order {
	
	User CreatedBy
	Date DateOrdered
	Date DateRecieved
	Boolean Urgent
	String ShipToAddress
	Object PackingSlipImage
	
	static hasMany = [Parts : Part]
	
    static constraints = {
		
    }
}
