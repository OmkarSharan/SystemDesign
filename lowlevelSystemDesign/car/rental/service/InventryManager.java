package car.rental.service;

import java.util.List;

public class InventryManager {
	List<Vehicle> vehicleList;
	
	public void addVehicle(Vehicle vehicle) {
		vehicleList.add(vehicle);
	}
	
	public void addVehicle(List<Vehicle> vehicle) {
		for(Vehicle v : vehicle) {
			vehicleList.add(v);
		}
	}
	
	public void removeVehicle(Vehicle vehicle) {
		vehicleList.remove(vehicle);
	}
	
	public Vehicle getVehicle(VehicleType vehicleType) {
		for(Vehicle vehicle : vehicleList) {
			if(vehicle.getVeichleType().equals(vehicleType))
				return vehicle;
		}
		return null;
	}
}
