package objectoriented;

public class Demo {
	public static void main(String[] args) {
		Car hondacity =new Car();
		hondacity.setColor("White");
		hondacity.setFueltype("Petrol");
		hondacity.setGeartype("Automatic");
		hondacity.setWheels(5);
		System.out.println("The color of the car is "+hondacity.getColor());
		System.out.println("The Fueltype of the car is "+hondacity.getFueltype());
		System.out.println("The  car is "+hondacity.getGeartype());
		System.out.println("The Car has "+hondacity.getWheels()+" Wheels");
		
		Car marutiswift =new Car();
		marutiswift.setColor("Red");
		marutiswift.setFueltype("disele");
		marutiswift.setGeartype("Mannual");
		marutiswift.setWheels(5);
		
	}

}
