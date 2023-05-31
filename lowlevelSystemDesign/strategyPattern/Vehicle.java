package strategyPattern;

public class Vehicle {
	DriveStrategy drive;
	Vehicle(DriveStrategy drive){
		this.drive = drive;
	}
	
	public void drive() {
		drive.drive();
	}
}
