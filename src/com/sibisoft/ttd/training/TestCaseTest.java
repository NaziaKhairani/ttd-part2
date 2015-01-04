package com.sibisoft.ttd.training;
/*
 * By Nazia Khairani
 * Chapter # 22
 * Dated 4th January 2015
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class TestCaseTest {

	@Test
	public void testTemplateMethod() {
		WasRun test = new WasRun("testMethod");
		test.run();
		assertEquals("setUp testMethod tearDown ",test.getLog());
	}
	
	@Test
	public void testResult() {
		WasRun test = new WasRun("testMethod");
		TestResult testResult = test.run();
		assertEquals("1 run, 0 failed",testResult.getSummary());
	}
	@Test
	public void testFailedResult() {
		try
		{
			WasRun test = new WasRun("testBrokenMethod"); 
			TestResult testResult = test.run();
			assertEquals("1 run, 1 failed",testResult.getSummary());
		} catch (Exception ex){
			fail("The test fails : \n "+ ex.getMessage());
		}
	}
	
	@Test
	public void testFailedResultFormatting() {
		TestResult testResult = new TestResult();
		testResult.testStarted();
		testResult.testFailed();
		assertEquals("1 run, 1 failed",testResult.getSummary());
	}
}