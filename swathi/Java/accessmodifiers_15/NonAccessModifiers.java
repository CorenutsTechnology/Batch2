package accessmodifiers_15;

public final class NonAccessModifiers {
	
	
	//public final String name;
	// if we declare final and if we don't initialize there itself we will get an
	// compilation error " Unresolved compilation problem: The blank final field
	// name may not have been initialized"
	
	public final int value1=10;
	
	
	public final void finalMethod() {
		System.out.println("final method");
	}
	
	
	
	
	public static void main(String[] args) {
		NonAccessModifiers nonAccessModifiers = new NonAccessModifiers();
		System.out.println(nonAccessModifiers.value1);
		nonAccessModifiers.finalMethod();
		
		
	}

}
