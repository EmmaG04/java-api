package Automation;

import org.testng.annotations.*;


public class TestNGPractice {
	
	@Test(priority=2)
	public void testcase1() {
		
		System.out.println("Executing my first test case");
	}
	
	@Test(priority=1)
	public void testcase2() {
		System.out.println("Executing my second test case");
	}
	
	@BeforeTest
	public void beforeTestExecution() {
		System.out.println("This is executed before the test");
	}
	
	@AfterTest
	public void afterTestExecution() {
		System.out.println("This is executed after the test");
	}
	
	@BeforeMethod
	public void beforeEachTestExecution() {
		System.out.println("This is executed before each test");
	}
	
	@AfterMethod
	public void afterEachTestExecution() {
		System.out.println("This is executed after each test");
	}
}
