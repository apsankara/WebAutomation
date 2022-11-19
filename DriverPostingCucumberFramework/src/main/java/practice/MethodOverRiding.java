package practice;


class bank
{
	double interestrate() 
	{
		return 20;
	}
}

class ICICI extends bank
{
	double interestrate() 
	{
		return 10.5;
	}
}

class SBI extends bank
{
	double interestrate() 
	{
		return 20.5;
	}
}

class Axis extends bank
{
	double interestrate() 
	{
		return 14;
	}
}

public class MethodOverRiding {

	public static void main(String[] args) {
		bank ban=new bank();
		System.out.println(ban.interestrate());
		ICICI ic=new ICICI();
		System.out.println(ic.interestrate());
		SBI sbi=new SBI();
		System.out.println(sbi.interestrate());
		Axis axis=new Axis();
		System.out.println(axis.interestrate());
	}

}
