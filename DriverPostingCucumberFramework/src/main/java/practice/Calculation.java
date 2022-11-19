package practice;

public class Calculation {

	
	int sum(int x, int y)
	{
		return x+y;
	}
	
	int sum(int x, int y, int z)
	{
		return x+y+z;
	}
	
	double sum(double x, double y)
	{
		return x+y;
	}
	
	double sum(double x, double y, double z)
	{
		return x+y+z;
	}
	
	static void sum1(int x, int y)
	{
		System.out.println(x+y);
	}
	
	void disaply()
	{
		System.out.println();
	}
	public static void main(String[] args) {
	
		Calculation cal=new Calculation();
		int val=cal.sum(10, 20);
		System.out.println(val);
		Calculation.sum1(10, 30);
		System.out.println(cal.sum(10.2, 10.5));
		System.out.println(cal.sum(7.5, 7.2, 7.6));
		System.out.println(cal.sum(2, 3, 4));
		
	}

}
