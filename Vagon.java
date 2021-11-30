package laborator6;

public abstract class Vagon {
	//public String type;
	public int packageCapacity;
	public boolean doorsAreOpen;
	
	public void Capacity (int packageCapacity) {
		this.packageCapacity = packageCapacity;
	}
	public void openDoors () {
		this.doorsAreOpen = true;
	}
	public void closeDoors () {
		this.doorsAreOpen = false;
	}
}
