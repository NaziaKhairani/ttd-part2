package com.sibisoft.ttd.training;
/*
 * By Nazia Khairani
 * Chapter # 19
 * Dated 4th January 2015
 */
public class WasRun extends TestCase{
	
	boolean wasRun;
	int wasSetUp;
	public WasRun(String name){
		 super(name);
		 this.wasRun= false;
	 }
	
//	public void testMethod(){
//		this.wasRun=true;
//	} 
	public void setUp(){
		this.wasRun= false;
		this.wasSetUp= 1;
	}
		
	
}