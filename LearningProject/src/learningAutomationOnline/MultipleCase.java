package learningAutomationOnline;

public class MultipleCase {
	String hero="Sankar";
	
	
	public void hero() {
		
		switch(hero) {
		case "Sankar":
			System.out.println("Sankar");
			break;
		case "Lingam":
			System.out.println("Lingam");
			break;
		case "Adhi":
			System.out.println("Adhi");
			break;
		case "Aji":
			System.out.println("Aji");
			break;
		case "Adhau":
			System.out.println("Adhau");
			break;
			default:
				System.out.println("No One");
		}
	}
	
	public static void main(String[] args) {
		MultipleCase myhero=new MultipleCase();
		myhero.hero();
	}

}
