package constractor;

public class Parent  {
	int value1;
	double value2;
	String name;
	
	 public Parent( int value1) {
		 this.value1=value1+40;
	 }
	 public Parent( int value1 ,double value2) {
		 this.value1=value1;
		 this.value2=value2;
	 }
	 public Parent( int value ,double value2, String name) {
		 this.value1=value1;
		 this.value2=value2;
		 this.name=name;
	 }
	public Parent() {
		this.value1=value1+20;
		
	}
	public static void main(String[] args) {
	
		Parent parent=new Parent(10,5.5,"kalyani");
		System.out.println(parent.name);
		System.out.println(parent.value2);
		System.out.println(parent.value1);
}
}
