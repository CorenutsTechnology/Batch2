package com.asignments;

import java.util.Optional;

public class PersonDetails 
{
	public static void main(String[] args) 
	{
		Optional<Person> optional=Optional.of(new Person("jyothi", 20));
		System.out.println(optional.get());
		System.out.println(optional.isPresent());
		Optional<Person>op=Optional.empty();
	//	System.out.println(op.get());
		//optional.ifPresent((e)->System.out.println(optional.get().getName()));
		optional.ofNullable(op);
		op.ofNullable(op);
		try {
		op.orElseThrow(()-> new IllegalArgumentException("exception occured"));
		
	}catch(Exception e)
		{
		System.out.println(e.getMessage());
		}

}
}
