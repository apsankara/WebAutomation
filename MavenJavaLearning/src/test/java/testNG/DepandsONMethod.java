package testNG;

import org.testng.annotations.Test;

public class DepandsONMethod {
	
	@Test(enabled=true)
	public void SecondarySchool()
	{
		System.out.println("Secondary School");
	}
	
	@Test(dependsOnMethods="SecondarySchool")
	public void HighSchool()
	{
		System.out.println("High School");
	}
	
	@Test(dependsOnMethods="HighSchool")
	public void College() 
	{
		System.out.println("College");
	}
}
