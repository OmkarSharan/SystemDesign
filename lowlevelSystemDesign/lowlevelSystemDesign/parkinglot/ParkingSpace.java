package lowlevelSystemDesign.parkinglot;

public class ParkingSpace {
	VehicleType vehicleType;
	String parkingSpaceNumber;
	boolean spaceBooked;
	public VehicleType getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getParkingSpaceNumber() {
		return parkingSpaceNumber;
	}
	public void setParkingSpaceNumber(String parkingSpaceNumber) {
		this.parkingSpaceNumber = parkingSpaceNumber;
	}
	public boolean isSpaceBooked() {
		return spaceBooked;
	}
	public void setSpaceBooked(boolean spaceBooked) {
		this.spaceBooked = spaceBooked;
	}
}
