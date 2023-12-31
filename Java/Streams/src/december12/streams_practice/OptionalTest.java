package december12.streams_practice;

import java.util.Optional;

public class OptionalTest 
{
	public static void main(String[] args) 
	{
//		//for string type
//		
		Optional<String> optional = Optional.ofNullable("");//used to create object for Optional
		System.out.println(optional.equals("hi"));
		System.out.println(optional.isPresent());
		System.out.println(optional.isEmpty());
		
//		
////		Optional<String> optional2 = Optional.of(null);//
////		System.out.println(optional2.equals("hi"));//it will throw nullpointerException
////		System.out.println(optional2.isPresent());
//		
////		String text = optional.orElseThrow(()->new IllegalArgumentException("text is required"));
//		String text1 = optional.orElse("hello");
//		System.out.println(text1);
//		System.out.println(text1.toUpperCase());
//		System.out.println(text1);//original string is not modified
//		
		
		//for Integer type
		
		Optional<Integer> optional2=Optional.empty();
		System.out.println(optional2.isEmpty());
		System.out.println(optional2.isPresent());
		
		System.out.println(optional2.getClass());
		System.out.println(optional2.stream());
		
		
	}
}
