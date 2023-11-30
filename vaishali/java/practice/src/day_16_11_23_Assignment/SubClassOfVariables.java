package day_16_11_23_Assignment;

public class SubClassOfVariables implements Variables{
	public static void main(String[] args) {
		
//		SubClassOfVariables variable=new SubClassOfVariables();
		
//		System.out.println(variable.intValue); //the static should be accessed in a static way
		
		System.out.println(Variables.intValue);
		
		System.out.println(Variables.name);
		
//		Variables.intValue=5;//In interface,variables has by default public static final : so,final variable can not be reinitialized
		
		
	}


	
}
