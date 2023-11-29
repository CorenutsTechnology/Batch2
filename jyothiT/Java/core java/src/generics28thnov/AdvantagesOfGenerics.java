package generics28thnov;

public class AdvantagesOfGenerics<T> 
{
	private T age;
	private T name;
	
	public T getAge() {
		return age;
	}
	public void setAge(T age) {
		this.age = age;
	}
	public T getName() {
		return name;
	}
	public void setName(T name) {
		this.name = name;
	}
	
	
	public static void main(String[] args) {
		
		AdvantagesOfGenerics<Integer> generics=new AdvantagesOfGenerics();
		generics.setAge(100);
		generics.setName(100);
		System.out.println(generics.getAge());
		System.out.println(generics.getName());
	}
}
