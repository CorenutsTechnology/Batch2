package constructor23thnov;

public class StaticVariablesConstructor {
	
	static int value;
	
	public StaticVariablesConstructor(int value) {
		
	    this.value=value;
	    System.out.println(value);
	}
	
	public static void main(String[] args) {
		
		StaticVariablesConstructor s=new StaticVariablesConstructor(10);
		System.out.println(s.value);
	}

}
