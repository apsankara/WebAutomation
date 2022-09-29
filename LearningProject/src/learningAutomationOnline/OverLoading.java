package learningAutomationOnline;

public class OverLoading {
	
	public void cinemas(Movie PS) {
		System.out.println("Welcome to Movies");
	}
	
	public void cinemas(Serial Sembaruthi) {
		System.out.println("Welcome to Serial");
	}
	
	public void cinemas(ShortFLim senthil) {
		System.out.println("Welcome to ShortFlim");
	}

	public static void main(String[] args) {
		OverLoading load=new OverLoading();
		
		Movie mov=new Movie();
		load.cinemas(mov);
		
		Serial ser=new Serial();
		load.cinemas(ser);
		
		ShortFLim shrt=new ShortFLim();
		load.cinemas(shrt);
	
	}

}
