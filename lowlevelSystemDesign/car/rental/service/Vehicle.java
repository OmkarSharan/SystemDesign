package car.rental.service;

public class Vehicle {
	private String number;
	private VehicleType veichleType;
	private String model;
	private String kmDriven;
	private String bodyType;
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public VehicleType getVeichleType() {
		return veichleType;
	}
	public void setVeichleType(VehicleType veichleType) {
		this.veichleType = veichleType;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getKmDriven() {
		return kmDriven;
	}
	public void setKmDriven(String kmDriven) {
		this.kmDriven = kmDriven;
	}
	public String getBodyType() {
		return bodyType;
	}
	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}
	
	
	
}
