
public class Vehicle {
	
	int no_of_seats;
	int no_of_wheels;
	
	public Vehicle() {
		System.out.println("This vehicle has "+ no_of_seats + " number of seats and " + no_of_wheels + " number of wheels.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle Motocycle = new Vehicle();
		Vehicle Car = new Vehicle();
	}

}
