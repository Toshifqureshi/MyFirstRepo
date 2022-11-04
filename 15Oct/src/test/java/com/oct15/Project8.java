package com.oct15;

import org.testng.annotations.Test;

public class Project8 {
	@Test(priority=-2)
	public void cat()
	{
		System.out.println("mew mew");
		
	}

	@Test(priority=1)
	void dog()
	{
		System.out.println("bhow bhow");
		
	}
	@Test(priority=0)
	void elephant()
	{
		System.out.println("trumphent");
	}
}
