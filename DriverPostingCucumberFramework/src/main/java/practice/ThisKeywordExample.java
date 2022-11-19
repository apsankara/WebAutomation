package practice;

public class ThisKeywordExample {

	
	
	int a=10;//instance variable class variable
	int b=20;
	
	void display()
		{
			System.out.println(a+b);
		}
	void sum(int a, int b)
	{
		this.a=a;///method variable
		this.b=b;
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		ThisKeywordExample ex=new ThisKeywordExample();
		ex.display();
		ex.sum(10, 50);
		
		
	}

}
