package arrays;

public class PersonArray {

	public static void main(String[] args) {
		PersonArray array= new PersonArray();
		Person[] persons=array.personValues();
		System.out.println(persons[0].getName());
		System.out.println(persons[0].getId());

		System.out.println(persons[1].getName());
		System.out.println(persons[1].getId());
//		System.out.println(persons[6].getAge());//we get ArrayIndexOfOutOfBounds 

		System.out.println(persons.length);
	
		

	}
	private Person[] personValues()
	{
		Person[] persons = new Person[5];

		Person person = new Person(2, "yuvi");
		person.setName("Rakhi");
		person.setId(1);
		persons[0] = person;
		
		Person person1 = new Person(10, "rekha");
		persons[1] = person1;
		Person person2 = new Person(01, "jerry");
		persons[2] = person2;
		Person person3 = new Person(2,"joe");
		persons[3] = person3;
		Person person4 = new Person(3,"zack");
		persons[4] = person4;
		return new Person[] { person, person1, person2, person3, person4 };
		
	}
	
}
