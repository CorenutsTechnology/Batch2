package assignment5_accessSpecifier;

public class Program2 {
//	--------------variables--------------
    public String type1="public_variable";
           private String type2="default_variable";
    protected String type3="protected_variable";
    private String type4="private_variable";
//    --------------methods---------------
	public String getType4() {
		return type4;
	}
	public void setType4(String type4) {
		this.type4 = type4;
	}
	public void publicMethod() {
			System.out.println("Public Method");
		}
	 void defaultMethod() {
		System.out.println("Default Method");
	}
	 
	private void privateMethod() {
			System.out.println("private Method");
		}
	protected void protectedMethod() {
		System.out.println("protected Method");
	}
//	--------------for default----------------
//	public String getType2() {
//		return type2;
//	}
//	public void setType2(String type2) {
//		this.type2 = type2;
//	}
//	------------for protected---------------
//	public String getType3() {
//		return type3;
//	}
//	public void setType3(String type3) {
//		this.type3 = type3;
//	}
	
}
