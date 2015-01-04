package com.sibisoft.ttd.training;
/*
 * By Nazia Khairani
 * Chapter # 20 
 * Dated 4th January 2015
 */
public class WasRun extends TestCase{
	 
	private boolean wasRun;
	private boolean wasSetUp;
	//private boolean wasRun;
	//private boolean wasSetUp;
 	private String log;
 	
 	public WasRun(String testMethodName){
 		super(testMethodName);
		this.wasRun = false;
		this.wasSetUp = false;
		//this.wasRun = false;
		//this.wasSetUp = false;
 	}
 	
 	public void setUp() {
		this.wasRun = false;
		this.wasSetUp = true; 
		this.log = "setUp";
		this.log = "setUp ";
	}
	public void tearDown(){
		log = log + "tearDown ";
 	}
	
 	/*getters*/
	/*public boolean wasRun() {
 		return wasRun;
 	}
 	public boolean wasSetUp() {
 		return wasSetUp;
	}
	}*/
 	public String getLog() {
 		return log;
 	}
 	
 	public String testMethod(){
		wasRun = true;
		log = log + " testMethod";
		//wasRun = true;
		log = log + "testMethod ";
 		return "yes! "+this.getTestMethodName()+" ran";
 	}
 	
 }