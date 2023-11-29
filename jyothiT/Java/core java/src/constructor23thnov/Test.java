package constructor23thnov;

public class Test {
	
	@org.junit.jupiter.api.Test
	void test()
	{
		Student stud=new Student("jyothi");
		if(stud.getName().equals("jyothi"))
		{
//		System.out.println(stud.name);
		}
		
	}
	@org.junit.jupiter.api.Test
	void thisTest()
	{
//		ThisConstructorChaining c=new ThisConstructorChaining("sapna",50000);
	}
	@org.junit.jupiter.api.Test
	void subconstructor()
	{
//		SubConstructorChaining c=new SubConstructorChaining("chetana");
	}
	@org.junit.jupiter.api.Test
	void overloadingTest()
	{
		ConstructorOverloading o=new ConstructorOverloading("jyothi",24);
	     System.out.println("name="+o.getName()+" "+"age="+o.getAge());
	}

}
