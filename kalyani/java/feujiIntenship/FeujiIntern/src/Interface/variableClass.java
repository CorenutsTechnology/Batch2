package Interface;

public class variableClass implements  VariableInterface {
   

	public static void main(String[] args) {
		//value1=86; //final feild VariableInterface value1 cannot assign
		variableClass variableClass=new variableClass();
		System.out.println(variableClass.value1);
		variableClass.method();
		System.out.println(value1);

	}

	@Override
	public void method() {
		System.out.println("method()");
		
	}

}
