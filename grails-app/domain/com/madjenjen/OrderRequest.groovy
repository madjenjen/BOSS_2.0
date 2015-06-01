package com.madjenjen

class OrderRequest {
	
	Date dateOrdered
	String orderType
	User creator
	String purchaseMethod
	Boolean urgent
	String shipMethod
	String quote
	Object packingSlipImage
	Vendor vendor
	OrderEntry orderEntry
	Receiver receiver
	Project project
	Account account
	String comment
	
	static hasMany = [orderEntry : OrderEntry]
	
    static constraints = {
		orderType inList: ["OCO", "A", "B", "C"]
		purchaseMethod inList: ["P-Card", "A", "B", "C"]
		shipMethod inList: ["FedEx 2-day", "FedEx"]
		
    }
}
