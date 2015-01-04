package com.sibisoft.ttd.training;
/*
 * By Nazia Khairani
 * Chapter # 19
 * Dated 4th January 2015
 */
public class TestCase {
	String name;
	
	public TestCase(){
	}
	
	public TestCase(String name){
		this.name = name;
	}
	public String run(){
		this.setUp();
		return this.name;
//		this.testMethod();
	}
	public void setUp(){
		
	}
}