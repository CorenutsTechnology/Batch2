package Generic;

public class GenericMethods {
	public<T> boolean calculator(T value1,T value2) {
		
		return false;
	
		
	}
	public<T>void calculate(GenericClass<T> value1, GenericClass<T> value2){
		

}
	public static void main(String args[]) {
		GenericMethods genericMethods=new  GenericMethods();
		GenericClass<Integer>obj1=new GenericClass();
		GenericClass<Integer> obj2=new GenericClass();
		genericMethods. <Integer> calculate(obj1, obj2);
		//genericMethods.<String>calculator("String1","String2");
		System.out.println(genericMethods.<String>calculator("String1","String2"));
		genericMethods.<Integer>calculator(20, 50);
}
}
