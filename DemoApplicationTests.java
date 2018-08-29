package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
		boolean result = DemoApplication.isPalindrome("Deleveled");
		Assert.assertTrue(result);
	}

	@Test
	public void testPalingrome() {
		boolean result = DemoApplication.isPalindrome("abcdcbA");
		Assert.assertTrue(result);
	}

	@Test
	public void testNotPalindrome() {
		boolean result = DemoApplication.isPalindrome("abcd");
		Assert.assertFalse(result);
	}

	@Test
	public void testPalindromeInt() {
		boolean result = DemoApplication.isPalindromeInt(424);
		Assert.assertTrue(result);
	}


}
