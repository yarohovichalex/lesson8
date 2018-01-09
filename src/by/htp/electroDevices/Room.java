package by.htp.electroDevices;

public class Room {
	private int powerConsumption = 0;
	private int id = 0;
	private ElectroDevice[] allDev; 
	
	public Room() {
		
	}
	public Room(ElectroDevice d) {
		
	}
	public void add(ElectroDevice d) {
		if(allDev == null) {
			this.allDev = new ElectroDevice[1];						
			for (int i = 0; i < allDev.length; i++) {
				this.allDev[i] = d;
//				this.allDev[i].setId(id);
			}
		}else {
			int arrLength = this.allDev.length + 1;
			ElectroDevice[] oldAllDev = this.allDev;
			allDev = new ElectroDevice[arrLength];
			for (int i = 0; i < oldAllDev.length; i++) {
				this.allDev[i] = oldAllDev[i];
				if(allDev[i].getId() < 1) {
					this.id ++;
					this.allDev[i].setId(id);
					
				}				
			}
			this.allDev[allDev.length-1] = d;
			this.id +=1;
			this.allDev[allDev.length-1].setId(id);
		}		
	}
	public void plug(int index) {
		this.powerConsumption  += this.allDev[index].getPower();
		this.allDev[index].turnOn();
	}
	
	public int getPowerConsumption() {
		return powerConsumption;
	}
	public void sortByPowerConsumption() {
		int st = 0;
		for (int i = allDev.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (allDev[j].getPower() > allDev[j + 1].getPower()) {
                	ElectroDevice tmp = allDev[j];
                    allDev[j] = allDev[j + 1];
                    allDev[j + 1] = tmp;
                }
            }
        }
	}
	public void searchForPowerValues(int initialValue, int finalValue) {
		for (int i = 0; i < allDev.length; i++) {
			if(initialValue < allDev[i].getPower() && allDev[i].getPower() < finalValue) {
				System.out.println("device [" + allDev[i].getName() + ", " + allDev[i].getBrand() + ", id = " + allDev[i].getId() + "] corresponds to the specified range");
			}
		}
	}
	
	@Override
	public String toString() {
		for (int i = 0; i < allDev.length; i++) {
			System.out.println("Room [allDev= " + allDev[i].getName() + " " + allDev[i].getBrand() + ", id = " + allDev[i].getId() + "]");
		}
		return "";		
	}
	
}
