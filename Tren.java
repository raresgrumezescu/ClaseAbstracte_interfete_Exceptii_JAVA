package laborator6;

import java.lang.*;
import java.util.Vector;

class CalatoriA extends Vagon {
	public int humanCapacity;
	
	public CalatoriA() {
		this.humanCapacity = 40;
		super.Capacity(300);
	}
	
	public void openDoors () {
		super.openDoors();
	}
	
	public void closeDoors () {
		super.closeDoors();
	}
}

class CalatoriB extends Vagon {
	public int humanCapacity;
	public boolean blockWindows;
	
	public CalatoriB() {
		this.humanCapacity = 50;
		super.Capacity(400);
	}
	
	public void openDoors () {
		super.openDoors();
	}
	
	public void closeDoors () {
		super.closeDoors();
	}
	
	public void blockWindows () {
		this.blockWindows = true;
	}
}

class Marfa extends Vagon {
	
	public Marfa() {
		super.Capacity(400);
	}
}

public class Tren implements Comparable{
	public Vector<Object> vagoane = new Vector<Object>();
	
	public void addVagon (Vagon vagon) {
		vagoane.add(vagon);
	}
	
	public int compareTo(Object tren) {
		int capacitate1 = 0;
		for (int i = 0; i < this.vagoane.size(); i++) {
			capacitate1 += vagoane.get(i).packageCapacity;
		}
	}
}
