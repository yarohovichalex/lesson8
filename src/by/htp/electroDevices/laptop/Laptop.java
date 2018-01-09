package by.htp.electroDevices.laptop;

import by.htp.electroDevices.ElectroDevice;
import by.htp.electroDevices.IElectronicDivice;

public class Laptop extends ElectroDevice implements ILaptop, IElectronicDivice{
	
	public Laptop(String brand, int power) {
		super("laptop", brand, power);
	}

	@Override
	public void recharging() {
		super.turnOn();
		System.out.println("the laptop was recharged");		
	}
	
	public void turnOff() {
		super.turnOff();
		System.out.println("laptop is not charging");
	}
	
	
}
