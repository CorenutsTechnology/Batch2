
public class Test extends Ex
{
	int ab =90;

	public static void main(String[] args) 
	{
		Ex obj = new Ex();
		Test t = new Test();
		obj.ab=12;
		System.out.println(obj.ab);
		
		//t.ab=1;
		System.out.println(""+t.ab);
		
		Ex obj2 = new Test();
		System.out.println(obj2.ab);
		obj2.ab=9;
		System.out.println(obj2.ab);
		System.out.println(obj.ab);
		Audi audi = new Audi();//all car,sunroof,audi methods are present in this reference
		audi.roof();
		audi.drive();
		
		Car audi2 = new Audi();
		//audi2.roof(); only car methods are present
		audi2.drive();
//		audi2.details();
		
		SunRoof audi3 = new Audi();
//		audi3.drive(); only SunRoof methods are present
		audi3.roof();
//		audi3.details();
		
		
	}
}
