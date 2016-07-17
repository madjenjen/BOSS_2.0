package com.madjenjen

class OrderAttachment {
	String attachmentType
	Date attachmentDate
	String comment
	byte[] scan
	
	static belongsTo = [orderRequest : OrderRequest]
	
	static constraints = {
		scan(nullable:false, maxSize:1073741824) // max of 4GB
	}
}
