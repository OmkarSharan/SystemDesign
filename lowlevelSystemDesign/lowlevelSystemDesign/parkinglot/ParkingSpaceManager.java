package lowlevelSystemDesign.parkinglot;

public interface ParkingSpaceManager {
	ParkingSpace getParkingSpace();
	void vacateParkingSpace(ParkingSpace parkingSpace);
	public void addParkingSpace(ParkingSpace space);
}
