package com.sibisoft.ttd.training;
/*
 * By Nazia Khairani
 * Chapter # 21
 * Dated 4th January 2015
 */
public class TestResult {
	private int runCount;
	private String summary;
	
	public TestResult(){
		this.runCount = 0;
	}
	public void testStarted(){
		this.runCount += 1;
	}
	public String getSummary() {
		return  this.runCount + " run, 0 failed";
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
}