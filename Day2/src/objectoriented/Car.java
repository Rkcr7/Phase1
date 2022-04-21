package objectoriented;

public class Car {
	private String fueltype;
	private int wheels;
	private String geartype;
	private String color;
	public String getFueltype() {
		return fueltype;
	}
	public void setFueltype(String fueltype) {
		this.fueltype = fueltype;
	}
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	public String getGeartype() {
		return geartype;
	}
	public void setGeartype(String geartype) {
		this.geartype = geartype;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Car [fueltype=" + fueltype + ", wheels=" + wheels + ", geartype=" + geartype + ", color=" + color + "]";
	}
	

	
}
