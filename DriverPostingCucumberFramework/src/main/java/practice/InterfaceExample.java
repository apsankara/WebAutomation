package practice;


public class InterfaceExample implements Interface1, Interface2 {

	@Override
	public void m2() {
		System.out.println("inter face 2 M2");
		
	}

	@Override
	public void m1() {
		System.out.println("interface 1 M1");
		
	}
	
	public void m3()
	{
		System.out.println("Normal class m3");
	}
	
	public static void main(String args[]) {
		InterfaceExample ex=new InterfaceExample();
		ex.m1();
		ex.m2();
		ex.m3();
		
	}

}
