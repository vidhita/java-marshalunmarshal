package com.beanio.data;

import org.beanio.annotation.Field;
import org.beanio.annotation.Record;
import org.beanio.annotation.Align;

@Record
class DataObject{

	@Field(at=0, length=10, align=Align.LEFT, padding=' ')
	String header = "HEADER";
	
	@Field(at=10, length=2)
	String version = "01";
	
	@Field(at=12, length=20, align=Align.LEFT, padding=' ')
	String firstName;
	
	@Field(at=32, length=20, align=Align.LEFT, padding=' ')
	String lastName;

	@Field(at=52, length=2, align=Align.LEFT, padding=' ',required=false)
	String age;
}