package Interface;

public class Audi extends Maruthi implements Car,car2 {

	
	 static String  Stringname="kalyani";
	
	
	public static void main(String[] args) {
		Car car=new Maruthi();
		car.engine();
		car.openDoor();
		car.Steering();
		System.out.println(Car.value);
		Audi car1= new Audi();
		car1.engine();
		car1.method();
		car1.method1();
		car1.Steering();
		car1.openDoor();
		car1.cost();
		System.out.println(Audi.Stringname);
		System.out.println(Audi.value);
		Maruthi car2=new Maruthi();
		car2.method1();
		car2.engine();
		car2.Steering();
		car2.openDoor();
		System.out.println(Maruthi.value);
		
	}
	public  void method() {
		System.out.println("method(1)");
	}

	@Override
	public void engine() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Steering() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void openDoor() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void cost() {
		// TODO Auto-generated method stub
		
	}


}
