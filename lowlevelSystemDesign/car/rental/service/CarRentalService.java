package car.rental.service;

import java.util.List;

public class CarRentalService {
	List<Customer> customer;
	
	List<Store> stores;
	
	
	CarRentalService(List<Customer> customer, List<Store> stores){
		this.customer = customer;
		this.stores = stores;
	}
	
	
	public Store getStore(Location location) {
		return StroreFactory.getStore(location);
	}
	
	public void addVehicleToStore(Store store, List<Vehicle> vehicles) {
		store.getInventryManager().addVehicle(vehicles);
	}
	//add Stores
	//remove stores
	
	
}
