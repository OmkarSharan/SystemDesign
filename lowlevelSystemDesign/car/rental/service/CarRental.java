package car.rental.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class CarRental {
	public static void main(String[] args) {
		Location banglore_loc = new Location("Banglore", 56007, "Karnataka", "India");
		Location delhi_loc = new Location("Delhi", 100006, "Delhi", "India");
	
		List<Customer> customers = getCustomerList();
		List<Vehicle> vehicles = getVehicleList();
		
		List<Store> stores = addStore(vehicles, banglore_loc);
		
		CarRentalService carRental = new CarRentalService(customers, stores);
		//USer search for store input location
		Store store = carRental.getStore(banglore_loc);
		
		Vehicle vehicle = store.getInventryManager().getVehicle(VehicleType.FOUR_WHEELER);
		
		Reservation res = new Reservation();
		res.setCustomer(customers.get(0));
		res.setNumberOfBookingDay(2);
		res.setFromDate(new Date());
		res.setToDate(new Date());
		res.setRes_id(1234);
		res.setVehicle(vehicle);
		
		Bill bill = new Bill();
		bill.setReservation(res);
		
		Payment pay = new Payment();
		pay.setBill(bill);
		
		
		store.setReservationList(new ArrayList<>(Arrays.asList(res)));
		
		
	    
		
		
		
	}
	
	public static List<Vehicle> getVehicleList(){
		Vehicle vehicle = new Vehicle();
		vehicle.setVeichleType(VehicleType.FOUR_WHEELER);
		Vehicle vehicle2 = new Vehicle();
		vehicle2.setVeichleType(VehicleType.FOUR_WHEELER);
		return new ArrayList<>(Arrays.asList(vehicle, vehicle2));
	}
	
	public static List<Customer> getCustomerList() {
		Customer cus = new Customer();
		cus.setDl_id("123");
		cus.setName("Puja");
		return new ArrayList<>(Arrays.asList(cus));
	}
	
	public static List<Store> addStore(List<Vehicle> vehicle, Location loc){
		Store st = new Store();
		st.setLoc(loc);
		st.setStore_id(123);
		st.setInventryManager(new InventryManager());
		st.getInventryManager().addVehicle(vehicle);
		return new ArrayList<>(Arrays.asList(st));
		
	}
}
