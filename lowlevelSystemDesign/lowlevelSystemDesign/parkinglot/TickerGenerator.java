package lowlevelSystemDesign.parkinglot;

public interface TickerGenerator {
	public Ticket getTicketDetails(EntryGate entryGate, VehicleDetail vehicle, ParkingSpaceManager parkingSpaceManager);
}
