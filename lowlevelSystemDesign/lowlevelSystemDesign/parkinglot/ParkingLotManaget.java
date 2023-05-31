package lowlevelSystemDesign.parkinglot;

public class ParkingLotManaget {
	public static void main(String [] args) {
		VehicleDetail vehicle = new VehicleDetail();
		vehicle.setVehicleNumber("12345");
		vehicle.setVehicleType(VehicleType.TwoWheeler);
		
		ParkingSpaceManager parkingSpaceManager = new TwoWheelerParkingSpaceManager(10);
		ParkingSpace parkingSpace = new ParkingSpace();
		parkingSpace.setVehicleType(VehicleType.TwoWheeler);
		parkingSpace.setParkingSpaceNumber("101");
		parkingSpace.setSpaceBooked(false);
		parkingSpaceManager.addParkingSpace(parkingSpace);
		TickerGenerator tiketGenerator = new TwoWheelerTicketGenerator(parkingSpaceManager);
		EntryGate entryGate = new EntryGate();
		entryGate.setGateNumber(10);
		System.out.println(tiketGenerator.getTicketDetails(entryGate, vehicle, parkingSpaceManager));
		
	}
}
