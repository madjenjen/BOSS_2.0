package com.madjenjen

class Attachment {
	String Type
	Date Date
	String Comment
	byte[] Scan
	
	static belongsTo=[order: Order]
	
	static constraints = {
		Scan(nullable:false, maxSize:1073741824) // max of 4GB
	}
}
