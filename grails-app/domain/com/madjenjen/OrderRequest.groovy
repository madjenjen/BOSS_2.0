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
		orderType inList: ["OCO", "OE", "OPS"]
		purchaseMethod inList: ["P-Card", "PO", "Cash", "Team Account"]
		shipMethod inList: ["FedEx 2-day", "FedEx Overnight", "Ground", "FedEx Intrnl Economy", "FedEx Intrnl Priority", "FedEx 3-days", "FedEx Priority Overnight", "N/A"]
		
    }
}
