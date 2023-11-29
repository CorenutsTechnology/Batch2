package constructor23thnov;

public class ConstructorOverloading {
	
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public ConstructorOverloading() {
		
		System.out.println("default constructoroverloading");
	}
	public ConstructorOverloading(int age)
	{
		this.age=age;
	}
	public ConstructorOverloading(String name)
	{
		this.name=name;
	}
	public ConstructorOverloading(String name,int age)
	{
		this.age=age;
		this.name=name;
	}

}
