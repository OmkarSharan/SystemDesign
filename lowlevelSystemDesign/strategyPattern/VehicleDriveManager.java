package strategyPattern;

public class VehicleDriveManager {
	public static void main(String [] args) {
	
		Vehicle two = new TwoWheeler();
		Vehicle four = new FourWheeler();
		two.drive();
		four.drive();
	}
}
