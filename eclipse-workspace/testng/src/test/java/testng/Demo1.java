package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo1 {

	@Test
	public void test1() {
		String str1="Selenium";
		String str2="Selenium";
		
		Assert.assertTrue(str1.contains("Selenium"));
		Assert.assertFalse(str1.contains("TestNG"));
		Assert.assertEquals(str1, str2);
	
	}
	@Test
	public void test2() {
		String str1="TestNG";
		String str2="TestNG";
		
		Assert.assertTrue(str1.contains("TestNG"));
		Assert.assertFalse(str1.contains("Selenium"));
		Assert.assertEquals(str1, str2);
	
	}
	@Test 
	public void test3() {
		String msg="welcome to testing";
		Assert.assertTrue(msg.contains("Testing"));
	}
	
	
}
