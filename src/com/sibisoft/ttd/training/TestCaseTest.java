package com.sibisoft.ttd.training;
/*
 * By Nazia Khairani
 * Chapter # 18
 * Dated 4th January 2015
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class TestCaseTest extends TestCase {

//	public TestCaseTest() {
//		super();
//	}

//	public TestCaseTest(String name) {
//		super(name);

	@Test
	public void testRunning() {
		WasRun test= new WasRun("testMethod");
		assertTrue(!test.wasRun);
		test.run();
		assertFalse(test.wasRun);
	}

}
