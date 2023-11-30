package gnerics_28_11;

public class Generic<T>{
	
	private T name;
	private T location;
	
	public T getName() {
		return name;
	}
	public void setName(T name) {
		this.name = name;
	}
	public T getLocation() {
		return location;
	}
	public void setLocation(T location) {
		this.location = location;
	}
	
	
	@Override
	public String toString() {
		return "Generic [name=" + name + ", location=" + location + "]";
	}
	
	
	public static void main(String[] args) {
		
		Generic gr=new Generic();
		gr.setName(new Person().name);
		gr.setLocation(new String("Hyderabad"));
		System.out.println(gr.getName());
		System.out.println(gr.getLocation());
		
	}
	
}

class Person{
	String name="roja";
}