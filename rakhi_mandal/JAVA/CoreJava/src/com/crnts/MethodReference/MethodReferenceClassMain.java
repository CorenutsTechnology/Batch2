package com.crnts.MethodReference;

public class MethodReferenceClassMain  {

	public static void main(String[] args) {
//		----------Lamda Expression----------------
//		MethodRefernceInterface m=(e1,e2)->{
//			return e1+e2;
//		};System.out.println(m.sum(3, 9));
//		
////		-------------Method Reference-----------
		Math math =new Math();
		MethodRefernceInterface i=math::sum;
//		System.out.println(i.sum(9, 0));
		i.sum(9, 0);
		
//		Math math =new Math();
//		MethodRefernceInterface i=Math::sum;
//		System.out.println(i.sum(99, 7));
	}
	
	

}
