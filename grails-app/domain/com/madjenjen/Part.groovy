package com.madjenjen

class Part {
	
	String partNumber
	Integer Quantity
	String Description
	Double priceEach
	Double Price
	
	static belongsTo=[order: Order]
}
