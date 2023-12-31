
public class Audi implements Car , SunRoof{

	@Override
	public void drive() {
		System.out.println("its audi car");
	}

	@Override
	public void roof() {
		System.out.println("its audi sunroof");
		
	}
	
	public void details()
	{
		System.out.println("audi details");
	}

}
