package com.diya.moduledemo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
	@Test
	public void addition_isCorrect() throws Exception {
		assertEquals(4, 2 + 2);
	}
	@Before
	public void sout() throws Exception {
		System.out.println("test11=== = " + System.currentTimeMillis());
	}
	@Test
	public void testnow(){
	}
}