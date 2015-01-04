package com.sibisoft.ttd.training;
/*
 * By Nazia Khairani
 * Chapter # 21
 * Dated 4th January 2015
 */
public class WasRun extends TestCase{

	//private boolean wasRun;
	//private boolean wasSetUp;
	private String log;
	
	public WasRun(String testMethodName){
		super(testMethodName);
		//this.wasRun = false;
		//this.wasSetUp = false;
	}
	
	public String getLog() {
		return log;
	}
	
	public void setUp() {
		this.log = "setUp ";
	}
	public void tearDown(){
		log = log + "tearDown ";
	}
	
	public String testMethod(){
		log = log + "testMethod ";
		return this.getTestMethodName();
	}
	
	public void testBrokenMethod()throws Exception{
		throw new Exception("within testBrokenMethod method");
	}
}