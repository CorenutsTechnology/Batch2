package lambda11DEC;
import java.util.*;
public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Employee> list=new ArrayList<>();
		list.add(new Employee(1,"padma","CSE"));
		list.add(new Employee(2,"siri","ECE"));
		list.add(new Employee(3,"latha","EEE"));
		list.add(new Employee(4,"hari","CSE"));
		list.add(new Employee(5,"krish","EEE"));
		
		list.stream().sorted((e,e1)->{return e.name.compareTo(e1.name);}).forEach(System.out::println);
	}

}
