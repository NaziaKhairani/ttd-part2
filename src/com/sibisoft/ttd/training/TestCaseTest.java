package com.sibisoft.ttd.training;
/*
 * By Nazia Khairani
 * Chapter # 19
 * Dated 4th January 2015
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class TestCaseTest extends TestCase {

	@Test
	public void testRunning() {
		WasRun test= new WasRun("testMethod");
		test.run();
		assert(test.wasRun);
	}
	
	@Test
	public void testSetUp(){
		WasRun test= new WasRun("testMethod");
		test.run();
		assertEquals(1, test.wasSetUp);
	}

}
