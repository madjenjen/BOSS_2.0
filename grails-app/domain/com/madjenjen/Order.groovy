package com.madjenjen

class Order {
	Vendor vendor
	Date dateOrdered
	String quote
	ShipTo shipTo
	String Type
	String Method
	Boolean urgent
	Project project
	Account account
	String shipBy
	String comment
	User creator
	
	static hasMany = [part : Part]
	static hasMany = [attachment : Attachment]
	
    static constraints = {
		Type inList: ["OCO", "OE", "OPS"]
		Method inList: ["P-Card", "PO", "Cash", "Team Account"]
		shipBy inList: ["FedEx 2-day", "FedEx Overnight", "Ground", "FedEx Intrnl Economy", "FedEx Intrnl Priority", "FedEx 3-days", "FedEx Priority Overnight", "N/A"]
		
    }
}
