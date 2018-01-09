package by.htp.electroDevices;

public abstract class ElectroDevice implements IElectronicDivice {	
	private double power;
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isOn() {
		return isOn;
	}
	public void setOn(boolean isOn) {
		this.isOn = isOn;
	}
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	private String brand;
	private boolean isOn;

	
	public ElectroDevice(String name, String brand, int power) {
		this.name = name;
		this.brand = brand;
		this.power = power;
	}
	public ElectroDevice(String name, String brand) {
		this.name = name;
		this.brand = brand;		
	}
	
	
	public double getPower() {
		return power;
	}
	public void setPower(double power) {
		this.power = power;
	}
	@Override
	public void turnOn() {
		//System.out.println("device is on");
		this.isOn = true;
		
	}
	@Override
	public void turnOff() {
		//System.out.println("device is off");
		this.isOn = false;
	}
}
