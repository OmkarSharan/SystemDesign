package lowlevelSystemDesign.parkinglot;

public class Ticket {
	private int ticketNumber;
	private VehicleDetail vehicle;
	private String entryDateTime;
	private EntryGate entryGate;
	public String getEntryDateTime() {
		return entryDateTime;
	}
	public void setEntryDateTime(String entryDateTime) {
		this.entryDateTime = entryDateTime;
	}
	public ParkingSpace getParkingSpace() {
		return parkingSpace;
	}
	public void setParkingSpace(ParkingSpace parkingSpace) {
		this.parkingSpace = parkingSpace;
	}
	private ParkingSpace parkingSpace;
	public int getTicketNumber() {
		return ticketNumber;
	}
	public void setTicketNumber(int ticketNumber) {
		this.ticketNumber = ticketNumber;
	}
	public VehicleDetail getVehicle() {
		return vehicle;
	}
	public void setVehicle(VehicleDetail vehicle) {
		this.vehicle = vehicle;
	}
	public String getEntryTime() {
		return entryDateTime;
	}
	public void setEntryTime(String entryTime) {
		this.entryDateTime = entryTime;
	}
	public EntryGate getEntryGate() {
		return entryGate;
	}
	public void setEntryGate(EntryGate entryGate) {
		this.entryGate = entryGate;
	}
	
}
