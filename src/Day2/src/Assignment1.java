class Automobile {
	int averageSpeed;
	String model;
	String color;
	int seats;
	static final String serviceProvider = "CDK";
	void start() {
		System.out.println("Accelerate & here you go");
	}
	void stop() {
		System.out.println("apply brakes & stop ");
	}
	void display() {
   		System.out.println("Speed of car is : " + averageSpeed);
		System.out.println("Model of car is : " + model);
		System.out.println("Color of car is : " + color);
		System.out.println("Seats of car is : " + seats);
		System.out.println("serviceProvider of car is : " + serviceProvider);
	}
	Automobile(){}
	Automobile(int averageSpeed, String model, String color, int seats) {
		this.averageSpeed = averageSpeed;
		this.model = model;
		this.color = color;
		this.seats = seats;
	}
    
}
class Car extends Automobile {
	String companyName;
	Car(int averageSpeed, String model, String color, int seats, String companyName) {
		super(averageSpeed,model,color,seats);
		this.companyName = companyName;
	}
	void display() {
   		super.display();
		System.out.println("companyName of car is : " + companyName);
	}
}
class Bus extends Automobile {
	String companyName;
	Bus(int averageSpeed, String model, String color, int seats, String companyName) {
		super(averageSpeed,model,color,seats);
		this.companyName = companyName;
	}
	void display() {
   		super.display();
		System.out.println("companyName of car is : " + companyName);
	}
}
class FlyingCar extends Car {
	int takeoffLength;
	FlyingCar(int averageSpeed, String model, String color, int seats,String companyName, int takeoffLength) {
		super(averageSpeed,model,color,seats,companyName);
		this.takeoffLength = takeoffLength;
	}
	void display() {
   		super.display();
		System.out.println("serviceProvider of car is : " + serviceProvider);
	}
}
class SportsCar extends Car {
	String layout;
	SportsCar(int averageSpeed, String model, String color, int seats, String companyName, String layout) {
		super(averageSpeed,model,color,seats,companyName);
		this.layout = layout;
	}
	void start() {
		System.out.println("car in the air!!!!!");
	}	
	void display() {
   		super.display();
		System.out.println("serviceProvider of car is : " + serviceProvider);
	}
}
class A {
	public static void main(String[] args) {
		Car c = new Car(60,"XYZ","black",4,"bmw");
		c.display();
		c.start();
		c.stop();
		Bus b = new Bus(80,"abc","red",25,"volvo");
		b.display();
		FlyingCar f = new FlyingCar(100,"jhd","yellow",2,"abc",25);
		f.display();
		f.start();
		SportsCar s = new SportsCar(120,"dsd","green",2,"edf","rf");
		s.display();
	}
}
	
	
		