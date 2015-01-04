package com.sibisoft.ttd.training;
/*
 * By Nazia Khairani
 * Chapter # 20
 * Dated 4th January 2015
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class TestCaseTest {
	 
	/*public WasRun setUp() {
 		return new WasRun("testMethod");
 	}
 	
    public void testSetup() {
 		WasRun test = setUp();
 		test.run();
 		assertTrue(test.wasSetUp());
-	}
+	}*/
 
	@Test
	public void testTemplateMethod() {
		WasRun test = new WasRun("testMethod");
		test.run();
		assertEquals("setUp testMethod tearDown ",test.getLog());
	}
 }
