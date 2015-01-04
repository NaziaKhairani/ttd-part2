package com.sibisoft.ttd.training;

import java.lang.reflect.Method;
/*
 * By Nazia Khairani
 * Chapter # 20 
 * Dated 4th January 2015
 */
public class TestCase {
 	
 	private String testMethodName;
 	
 	public TestCase(String testMethodName){
 		this.testMethodName = testMethodName;
 	}
 	
 	public String getTestMethodName() {
 		return testMethodName;
 	}
 	public void setTestMethodName(String testMethodName) {
 		this.testMethodName = testMethodName;
 	}
 
 	public void run(){
 		try{
 			setUp();
 			Method method = this.getClass().getMethod(testMethodName);
 			method.invoke(this);
			tearDown();
 		}
 		catch(Exception exp){
 			exp.getMessage();
 		}
    	 
 	}
 	
    public void setUp() {
 		
    }
	
    public void tearDown() {
    	
    }
 	
 }