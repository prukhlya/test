package test;

public class Car extends Vehicle {

	public int wheels = 0;
	public int doors = 0;
	public int windows = 0;
	public boolean currentlyRunning = false;
	public String color = null;
	
	public boolean lightsWork() {
		return true;
	} 
	
	public boolean exhaustSmokes() {
		return false;
	}

	public Car(int wheels, int doors, int windows, boolean currentlyRunning, String color) {
		super();
		this.wheels = wheels;
		this.doors = doors;
		this.windows = windows;
		this.currentlyRunning = currentlyRunning;
		this.color = color;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public int getWindows() {
		return windows;
	}

	public void setWindows(int windows) {
		this.windows = windows;
	}

	public boolean isCurrentlyRunning() {
		return currentlyRunning;
	}

	public void setCurrentlyRunning(boolean currentlyRunning) {
		this.currentlyRunning = currentlyRunning;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void accelerateVehicle() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void brakeVehicle() {
		// TODO Auto-generated method stub
		
	}
	
}