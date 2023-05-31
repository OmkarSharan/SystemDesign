package car.rental.service;

import java.util.List;

public class Store {
	public int store_id;
	public InventryManager inventryManager;
	public Location loc;
	public List<Reservation> reservationList;
	
	public int getStore_id() {
		return store_id;
	}
	public void setStore_id(int store_id) {
		this.store_id = store_id;
	}
	public InventryManager getInventryManager() {
		return inventryManager;
	}
	public void setInventryManager(InventryManager inventryManager) {
		this.inventryManager = inventryManager;
	}
	public Location getLoc() {
		return loc;
	}
	public void setLoc(Location loc) {
		this.loc = loc;
	}
	public List<Reservation> getReservationList() {
		return reservationList;
	}
	public void setReservationList(List<Reservation> reservationList) {
		this.reservationList = reservationList;
	}
	
	
	
	 
}
