package learningAutomationOnline;

public class Benz extends Car {
	@Override
	public void EngineSecret() {
		System.out.println("BenzEngine Secret");
	}
	
	@Override
	public void ModelSecret() {
		System.out.println("BenzModel Secret");
	}
	
	public static void main(String [] args) {
		Car car=new BMW();
		car.EngineSecret();
		car.ModelSecret();
		
	}
}
