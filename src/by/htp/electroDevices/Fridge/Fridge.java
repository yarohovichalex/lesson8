package by.htp.electroDevices.Fridge;

import by.htp.electroDevices.ElectroDevice;

public class Fridge extends ElectroDevice implements IFridge{

	public Fridge(String brand, int power) {
		super("Fridge", brand, power);		
	}

	@Override
	public void cooling() {
		super.turnOn();
		System.out.println("refrigerator cools");
	}
	
	public void turnOff() {
		super.turnOff();
		System.out.println("refrigerator is off");
	}

	
	
}
