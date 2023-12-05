
package assignment5_accessSpecifier;
//To access the properties of abstract class inheritance is needed and then through object of child class those properties can be accessed 
public class Program6_1 extends Program6 {
  
	public static void main(String[] args) {
		Program6_1 program6=new Program6_1();
		System.out.println(program6.id);
		System.out.println(program6.name);
		program6.display();
		
	}

}
