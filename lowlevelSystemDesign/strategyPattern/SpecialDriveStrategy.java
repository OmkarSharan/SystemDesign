package strategyPattern;

public class SpecialDriveStrategy implements DriveStrategy{
	
	@Override
	public void drive() {
		System.out.println("I love special drive strategy");
	}

}
