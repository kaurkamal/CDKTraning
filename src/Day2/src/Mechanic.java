abstract class Vehicle {
	int vin;
	String name;
	int speed;
	Vehicle() {}
	Vehicle(int vin, String name, int speed) {
		this.vin = vin;
		this.name = name;
		this.speed = speed;
	}
	void details(){
		System.out.println(vin);
		System.out.println(name);
		System.out.println(speed);
	}
	abstract void drive();
	abstract void inspect();
}
class Bike extends Vehicle{
	Bike(int vin, String name, int speed){
		super(vin,name,speed);
	}	
 	void drive(){
		System.out.println("start driving");
	}
	void inspect(){
		System.out.println("xyz");
	}
}
class Car extends Vehicle{
	Car(int vin, String name, int speed){
		super(vin,name,speed);
	}
 	void drive(){
		System.out.println("enjoy testdrive");
	}
	void inspect(){
		System.out.println("abc");
	}
}
class Mechanic {
	public static void main(String[] arr) {
	Bike bike = new Bike(10, "volvo", 60);
	bike.details();
	bike.drive();
	Car car = new Car(1010, "bmw" , 80);
	car.details();
	car.drive();
	car.inspect();
	}
}
			