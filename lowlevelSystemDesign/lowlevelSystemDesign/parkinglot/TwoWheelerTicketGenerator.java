package lowlevelSystemDesign.parkinglot;

public class TwoWheelerTicketGenerator implements TickerGenerator{

	ParkingSpaceManager parkingSpaceManager;
	TwoWheelerTicketGenerator(ParkingSpaceManager parkingSpaceManager){
		this.parkingSpaceManager = parkingSpaceManager;
	}
	
	
	@Override
	public Ticket getTicketDetails(EntryGate entryGate, VehicleDetail vehicle,  ParkingSpaceManager parkingSpaceManager) {
		Ticket ticket = new Ticket();
		if(parkingSpaceManager.getParkingSpace() != null) {
			ParkingSpace parkingSpace = parkingSpaceManager.getParkingSpace();
			ticket.setVehicle(vehicle);
			ticket.setEntryTime("10:30");
			ticket.setTicketNumber(123);
			ticket.setParkingSpace(parkingSpace);
			ticket.setEntryGate(entryGate);
			return ticket;
		}
		return null;
	}

}
