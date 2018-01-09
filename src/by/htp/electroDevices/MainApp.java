package by.htp.electroDevices;

import by.htp.electroDevices.Fridge.Fridge;
import by.htp.electroDevices.kettle.Kettle;
import by.htp.electroDevices.laptop.Laptop;

public class MainApp {

	public static void main(String[] args) {
		ElectroDevice e = new Kettle("Samsung", 2000);
		ElectroDevice l = new Laptop("Dell", 200);
		ElectroDevice f = new Fridge("Philips", 1500);
		ElectroDevice ee = new Kettle("Samsung", 2000);
		ElectroDevice ll = new Laptop("Dell", 200);
		ElectroDevice ff = new Fridge("Philips", 1500);

		System.out.println();
		Room r = new Room();
		r.add(l);
		r.add(e);
		r.add(f);
		r.add(ll);
		r.add(ee);
		r.add(ff);
		r.plug(0);
		r.plug(1);
		r.searchForPowerValues(1400, 1600);
//		r.sortByPowerConsumption();
//		
//		System.out.println(r);
//		
		
		
	}

}
