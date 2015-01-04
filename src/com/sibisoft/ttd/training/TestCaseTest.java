package com.sibisoft.ttd.training;
/*
 * By Nazia Khairani
 * Chapter # 23
 * Dated 4th January 2015
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class TestCaseTest {

	private TestResult testResult;

    public void setUp() {
    	testResult = new TestResult();
	}
    
    @Test
	public void testTemplateMethod() {
    	setUp();
		WasRun test = new WasRun("testMethod");
		test.run(testResult);
		assertEquals("setUp testMethod tearDown ",test.getLog());
	}
	@Test
	public void testResult() {
		setUp();
		WasRun test = new WasRun("testMethod");
		test.run(testResult);
		assertEquals("1 run, 0 failed",testResult.getSummary());
	}
	
	@Test
	public void testFailedResult() {
		try
		{
			setUp();
			WasRun test = new WasRun("testBrokenMethod"); 
			test.run(testResult);
			assertEquals("1 run, 1 failed",testResult.getSummary());
		} catch (Exception ex){
			fail("The test fails due to following reason: \n "+ ex.getMessage());
		}
	}
	
	@Test
	public void testFailedResultFormatting() {
		setUp();
		testResult.testStarted();
		testResult.testFailed();
		assertEquals("1 run, 1 failed",testResult.getSummary());
	}
	
	@Test
	public void testSuite() {
		setUp(); 
		TestSuite suite = new TestSuite();
		suite.addTest(new WasRun("testMethod"));
		suite.addTest(new WasRun("testBrokenMethod"));
		
		suite.run(testResult);
		assertEquals("2 run, 1 failed",testResult.getSummary());
	}
	
	@Test
	public void main() {
		setUp();
		TestSuite suite = new TestSuite();
		suite.addTest(new WasRun("testTemplateMethod"));
		suite.addTest(new WasRun("testResult"));
		suite.addTest(new WasRun("testFailedResult"));
		suite.addTest(new WasRun("testFailedResultFormatting"));
		suite.addTest(new WasRun("testSuite"));
		
		suite.run(testResult);
		//assertEquals("2 run, 1 failed",testResult.getSummary());
	}
}