package pack1;

public class TryCatchExample {

	public static void main(String[] args) {
		int a=20;
		try {
			//System.out.println(a/0);
			//String b=null;
			//System.out.println(b.length());//NullPointerException
			String x="123";
			int b=Integer.parseInt(x);
			System.out.println(b);
		}
		catch(ArithmeticException ex)
		{
			System.out.println(ex);
		}
		finally
		{
			System.out.println("Final block executed");
		}
	}

}
