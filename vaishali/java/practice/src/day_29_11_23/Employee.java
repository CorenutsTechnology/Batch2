package day_29_11_23;

public class Employee<T> {
	private T name;
	private T age;
	public T getName() {
		return name;
	}
	public void setName(T name) {
		this.name = name;
	}
	public T getAge() {
		return age;
	}
	public void setAge(T age) {
		this.age = age;
	}
	
}
