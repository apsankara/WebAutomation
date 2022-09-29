package learningAutomationOnline;

public class MethodOverriding extends Parent{

	public void marriage() {
		System.out.println("i am going to marry my own girl");
	}
	
	public static void main(String[] args) {
		Parent parent=new MethodOverriding();
		parent.Property();
		parent.marriage();
		
	}

}
