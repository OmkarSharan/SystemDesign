package car.rental.service;

public class Location {
	private String address;
	private int pinCode;
	private String state;
	private String country;
	
	Location(String address, int pinCode, String state, String country){
		this.address = address;
		this.pinCode = pinCode;
		this.state = state;
		this.country = country;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
}
