package com.oct15;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependsonmethod {
	@Test()
	void test1()
	
	{
		Assert.fail();
		System.out.println("hello");
		}
	@Test(dependsOnMethods="test1")
	void test2()
	{System.out.println("welcome");}
	@Test
	void test3()
	{System.out.println("bye");}

}
