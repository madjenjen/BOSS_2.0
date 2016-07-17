package com.madjenjen

class Part {
	
	String partNumber
	Integer quantity
	String description
	Double priceEach
	Double price
	
	static belongsTo = [orderRequest : OrderRequest]
}
