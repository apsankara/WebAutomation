package pack1;

public class B implements A, C {

	@Override
	public void sum() {
		System.out.println(a+b);		
	}
	
	public void mul() {
		System.out.println(x+y);
	}
	
	public static void main(String[] args) {
		B b=new B();
		b.sum();
		b.mul();
		
		
	}

	

}
