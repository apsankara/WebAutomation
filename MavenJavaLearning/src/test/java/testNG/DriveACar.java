package testNG;

import org.testng.annotations.Test;

public class DriveACar {
	
	@Test(priority=-1)
	public void startCar()
	{
		System.out.println("Start the Car");
	}
	
	@Test(priority=-2)
	public void putFirstGear()
	{
		System.out.println("change to First gear");
	}
	@Test(priority=0)
	public void putSecondGear()
	{
		System.out.println("change to second gear");
	}
	@Test(priority=3)
	public void putThirdGear()
	{
		System.out.println("Change the third gear");
	}
	@Test(priority=4)
	public void putfourthgear()
	{
		System.out.println("Change the fourth gear");
	}
	@Test(priority=5)
	public void putfifthgear()
	{
		System.out.println("Change the Fifth Gear");
	}
	

}
