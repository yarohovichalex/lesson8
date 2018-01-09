package by.htp.electroDevices.alarmClock;

import by.htp.electroDevices.ElectroDevice;
import by.htp.electroDevices.Fridge.IFridge;

public class AlarmClock extends ElectroDevice implements IFridge{

	public AlarmClock(String brand) {
		super("Alarm clock", brand);
	}

	@Override
	public void cooling() {
		super.turnOn();
		System.out.println("the alarm is set, the connection does not need to be");		
	}
	
	public void turnOff() {
		super.turnOff();
		System.out.println("the alarm does not tingle, you can sleep");
	}

}
