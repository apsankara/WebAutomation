package testNG;

import org.testng.annotations.Test;

public class GroupingExample {
	
	@Test(groups= {"apple"})
	public void apple1()
	{
		System.out.println("Apple1 Testing");
	}
	@Test(groups= {"apple"})
	public void apple2()
	{
		System.out.println("Apple Testing");
	}
	@Test(groups= {"moto"})
	public void moto1()
	{
		System.out.println("MOTO1 Testing");
	}
	@Test(groups= {"moto"})
	public void moto2()
	{
		System.out.println("MOTO Testing");
	}
	@Test(groups= {"vovo"})
	public void vovo1()
	{
		System.out.println("VOVO1 Testing");
	}
	@Test(groups= {"vovo"})
	public void vovo2()
	{
		System.out.println("Vovo Testing");
	}
}

