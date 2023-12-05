package accessmodifiers_15;

public class AccessClassProperties {
	
	public int intValue;
	private double doubleValue;
	protected char charValue;
	float floatValue;
	
	
	public void publicMethod() {
		System.out.println("public method");
		
	}
	
	private void privateMethod(){
		System.out.println("private method");
		
	}
	
	protected void protectedMethod() {
		System.out.println("protected method");
	}
	void defaultMethod() {
		System.out.println("default method");
	}
	public static void main(String[] args) {
		AccessClassProperties accessClassProperties = new AccessClassProperties();
		accessClassProperties.defaultMethod();
		accessClassProperties.privateMethod();
		accessClassProperties.publicMethod();
		System.out.println(accessClassProperties.charValue); 
		
	}
	
	
	

}
