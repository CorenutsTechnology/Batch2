package com.crnt.test.nov;

import java.lang.reflect.Array;
import java.util.Arrays;

import com.crnt.bean.Person;

public class Pgr_08 {
public static void main(String[] args) {
	Pgr_08 pgr_08=new Pgr_08();
	
	Person[] person=pgr_08.person();
	System.out.println(person[0].getName());
	System.out.println(person[3].getValue());
	System.out.println(person.length);
	System.out.println(Arrays.toString(person));

}

private  Person[] person() {
	// TODO Auto-generated method stub
	//Person person[]=new Person[4];
	Person person1=new Person();
	person1.setName("Array");
	person1.setValue(0);
	//person[0]=person1;
	
	
	Person person2=new Person();
	//person[1]=person2;
	person2.setName("Array1");
	person2.setValue(1);
	
	Person person3=new Person();
	//person[2]=person3;
	
	Person person4=new Person();
	//person[3]=person4;
	//System.out.println(Arrays.toString(person));
	//return person;
	
	return new Person[] {person1,person2,person3,person4};
	
}

}
