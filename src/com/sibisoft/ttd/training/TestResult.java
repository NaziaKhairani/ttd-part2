package com.sibisoft.ttd.training;
/*
 * By Nazia Khairani
 * Chapter # 22
 * Dated 4th January 2015
 */
public class TestResult {
	private int runCount;
	private int errorCount;
	private String summary;
	
	public TestResult(){
		this.runCount = 0;
		this.errorCount = 0;
	}
	public void testStarted(){
		this.runCount += 1;
	}
	public void testFailed(){
		this.errorCount += 1;
	}
	public String getSummary() {
		return  this.runCount + " run, "+this.errorCount+" failed";
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
}