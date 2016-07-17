package com.madjenjen

class OrderRequest {
	Vendor vendor
	Date dateOrdered
	String quote
	ShipTo shipTo
	String orderType
	String orderMethod
	Boolean urgent
	Project project
	Account account
	String shipBy
	String comment
	User creator
	
	static hasMany = [orderAttachment : OrderAttachment, part : Part]
	
    static constraints = {
		orderType inList: ["OCO", "OE", "OPS"]
		orderMethod inList: ["P-Card", "PO", "Cash", "Team Account"]
		shipBy inList: ["FedEx 2-day", "FedEx Overnight", "Ground", "FedEx Intrnl Economy", "FedEx Intrnl Priority", "FedEx 3-days", "FedEx Priority Overnight", "N/A"]
    }
}
