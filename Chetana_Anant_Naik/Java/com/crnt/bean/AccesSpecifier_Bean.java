package com.crnt.bean;

public class AccesSpecifier_Bean {
	private String stringValue = "private";
    String stringValue1 = "default";
public String stringValue2 = "public";
protected String stringValue3="protected";
public void publicMethod() {
System.out.println("public Method ");
}
void defaultMethod() {
System.out.println("default Method ");
}
private void privateMethod() {
	System.out.println("private Method ");
}
protected void protectedMethod() {
	System.out.println("protected Method ");
}

}
