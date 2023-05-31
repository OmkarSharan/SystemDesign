package car.rental.service;

import java.util.Date;

public class Reservation {
	private int res_id;
	private Customer customer;
	private Vehicle vehicle;
	private int numberOfBookingDay;
	private ReservationStatus ReservationStatus;
	
	private Date fromDate;
	private Date toDate;
	public int getRes_id() {
		return res_id;
	}
	public void setRes_id(int res_id) {
		this.res_id = res_id;
	}

	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public int getNumberOfBookingDay() {
		return numberOfBookingDay;
	}
	public void setNumberOfBookingDay(int numberOfBookingDay) {
		this.numberOfBookingDay = numberOfBookingDay;
	}
	public ReservationStatus getReservationStatus() {
		return ReservationStatus;
	}
	public void setReservationStatus(ReservationStatus reservationStatus) {
		ReservationStatus = reservationStatus;
	}
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	public Date getToDate() {
		return toDate;
	}
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}	
	
	
}
