package com.cnts.nov21;

//SuperClass
class Person
{
	String name;
	public Person(String name)
	{
		this.name=name;
	}
	public void display()
	{
		System.out.println("Name: "+name);
	}
}

//SubClas
class Student extends Person 
{
    int rollNumber;

    Student(String name, int rollNumber)
    {
        super(name); // Call to the constructor of the superclass
        this.rollNumber = rollNumber;
    }

    @Override
   public void display()
    {
        super.display(); // Call to the display method of the superclass
        System.out.println("Roll Number: " + rollNumber);
    }
}

//MainClass
public class DataBinding6 {
	public static void main(String[] args) {
		Student student = new Student("Anisha", 1);
		
		Person person = student;      //upcasting
		person.display();
	
		student.display();
		
		/*
		 * The ability to use a reference of the superclass to 
		 * refer to an object of the subclass is a key aspect of 
		 * polymorphism and data binding.
		 */
		
	}
}
