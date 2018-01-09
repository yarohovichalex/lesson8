package by.htp.electroDevices.kettle;

import by.htp.electroDevices.ElectroDevice;
import by.htp.electroDevices.IElectronicDivice;

public class Kettle extends ElectroDevice implements IKettle, IElectronicDivice{
	
	public Kettle(String brand, int power) {
		super("kettlle", brand, power);
	}

	@Override
	public void boil() {
		super.turnOn();
		System.out.println("voda nagrelas");		
	}
	
	public void turnOff() {
		super.turnOff();
		System.out.println("the kettle switches itself off after heating");
	}

	

}
