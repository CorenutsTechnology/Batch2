package nov15th;

class PersonA {
	
    PersonB b=new PersonB();
    PersonA()
    {
//    	b.method1(); inside constructor if we are trying to call private method we will get compiletime error
    	b.method2();
    	b.method3();
    	b.method4();
    	method();
    }
    
    private void method()
    {
    	System.out.println("non static method inside the class");
    }
    public static void main(String[] args) {
		PersonA a=new PersonA();
	}

}
