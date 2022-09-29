package learningAutomationOnline;

public class BMW extends Car {
	@Override
	public void EngineSecret() {
		System.out.println("BMWEngine Secret");
	}
	@Override
	public void ModelSecret() {
		System.out.println("BMWModel Secret");
	}
	
	public static void main(String [] args) {
		Car car=new BMW();
		car.EngineSecret();
		car.ModelSecret();
		car.ModelSecret1();
		
	}

}
