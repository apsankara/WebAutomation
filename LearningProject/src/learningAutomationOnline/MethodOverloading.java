package learningAutomationOnline;

public class MethodOverloading {

	
	
	int add(int a, int b) {
		return a+b;
	}
	
	int add(int a, int b,int c) {
		return a+b+c;
		
	}
	
	float add(float a) {
		return a;
	}
	
	public static void main(String[] args) {
		MethodOverloading over=new MethodOverloading();
		System.out.println(over.add(10,3));
		System.out.println(over.add(10,3,4));
		System.out.println(over.add(Math.abs(2)));
		
	}

}
