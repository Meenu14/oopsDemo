package oopsdemo2;

public class TestVehicle {

	public static void main(String[] args) {
		
		Vehicle vObj=new Vehicle();
		vObj.drive();
		
		Vehicle vCar=new Car1();  //UpCasting
		vCar.drive(); ///  invoke override drive method of car1 class
		
		Vehicle vTruck=new Truck(); // upcasting 
		vTruck.drive();
		
		// vTruck.drive(); //compile time error
		
		Truck t1=new Truck();
		t1.load();
				
	}

}
