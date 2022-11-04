package com.oct15;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Invocation {
	@Test(invocationCount=1)
void student1()
{System.out.println("who attendes class regular");
Reporter.log("success", true);
}

@Test(enabled=true,invocationCount=2)
void student2()
{System.out.println("who skips class once in a week");
Reporter.log("sucess", true);
}
@Test(priority=0,invocationCount=5)
void student3()
{System.out.println("who are irregular");}
}

