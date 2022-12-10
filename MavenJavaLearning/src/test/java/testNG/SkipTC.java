package testNG;

import org.testng.annotations.Test;

public class SkipTC {
	@Test(priority=-2)
	public void startCar()
	{
		System.out.println("Start the Car");
	}
	
	@Test(priority=-1)
	public void putFirstGear()
	{
		System.out.println("change to First gear");
	}
	@Test(priority=0)
	public void putSecondGear()
	{
		System.out.println("change to second gear");
	}
	@Test(priority=1)
	public void putThirdGear()
	{
		System.out.println("Change the third gear");
	}
	@Test(priority=2)
	public void putfourthgear()
	{
		System.out.println("Change the fourth gear");
	}
	@Test(priority=3, enabled=false)
	public void MusicON()
	{
		System.out.println("Music ON");
	}
	

}
