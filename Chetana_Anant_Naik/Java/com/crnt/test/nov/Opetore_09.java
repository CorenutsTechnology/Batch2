package com.crnt.test.nov;

import com.crnt.bean.Person;

public class Opetore_09 {
	public static void main(String[] args) {
//		Arithmatic arithmaticOpetore=new Arithmatic();
//		arithmaticOpetore.addition(93, 65);
//		arithmaticOpetore.subtration(100, 10);
//		arithmaticOpetore.multiplication(10, 50);
//		arithmaticOpetore.division(50, 10);
		
//		UnaryOperatory unaryOperatory =new UnaryOperatory();
//		unaryOperatory.postIncrement(5);
//		unaryOperatory.preIncrement(5);
//		unaryOperatory.postDecrement(5);
//		unaryOperatory.preDecrement(5);
		
//		Relational relational =new Relational();
//		relational.equalsOpetore(10, 5);
//		relational.notEqualsOpetore(10, 5);
//		relational.greaterthenOrlessthen(10,30);
//		relational.greaterthenOrequlsAndlessthenOrEquals(10, 50);
		
//		LogicalOperator logicalOperator=new LogicalOperator();
//		logicalOperator.andOperator(10, 50);
//		logicalOperator.OrOperator(10,50);
//		logicalOperator.differenceOfAnds(10,50);
		
		Ternary ternary=new Ternary();
		Person person=new Person();
//		ternary.differenceOfAnds(10, 20);
		ternary.instanceofOperator("hello");
		ternary.instanceofOperator(person);
		ternary.bodmas(5, 10);
	}
}
		
	 class Arithmatic{
		 void addition(int value1,int value2) {
				int result=(value1+value2)+(value1+100);
				System.out.println(result);
			}
			 void subtration(int value1,int value2) {
					int result=(value1-value2)-(value1-100);
					System.out.println(result);
				}
			 void multiplication(int value1,int value2) {
					int result=(value1*value2)*(value1+100);
					System.out.println(result);
				}
			 void division(double value1,double value2) {
				 double result=(value1+value2)/(value1+100);
					System.out.println(result);
				}
}
	 
	 class UnaryOperatory{
		 void postIncrement(int value) {
			 value++;
			 System.out.println(value);
			 System.out.println(value++);
			 System.out.println(value);
			 int value1=value+++value+value++;
			 System.out.println(value1);
			}
		 void preIncrement(int value) {
			 ++value;
			 System.out.println(value);
			 System.out.println(++value);
			 System.out.println(value);
			 int value1=++value+value+++value;
			 System.out.println(value1);
			}
		 
		 void postDecrement(int value) {
			 value--;
			 System.out.println(value);
			 System.out.println(value--);
			 System.out.println(value);
			 int value1=value--+value+value--;
			 System.out.println(value1);
			}
		 
		 void preDecrement(int value) {
			 --value;
			 System.out.println(value);
			 System.out.println(--value);
			 System.out.println(value);
			 int value1=--value+value+--value;
			 System.out.println(value1);
			}
		 
	 }
class Relational{
	 void equalsOpetore(int value1,int value2) {
		 boolean result=(value1==value2);//it return true or false
		 System.out.println(result);
		}
	 
	 void notEqualsOpetore(int value1,int value2) {
		 boolean result=(value1!=value2);//it return true or false
		 System.out.println(result);
		}

	 void greaterthenOrlessthen(int value1,int value2) {
		 boolean result=(value1>value2);//it return true or false
		 boolean result1=(value1<value2);
		 System.out.println("greaterthenValue is "+result);
		 System.out.println("lessthenValue is "+result1);
		}
	 
	 void greaterthenOrequlsAndlessthenOrEquals(int value1,int value2) {
		 boolean result=(value1>=value2);//it return true or false
		 boolean result1=(value1<=value2);
		 System.out.println("greaterthenValue is "+result);
		 System.out.println("lessthenValue is "+result1);
		}
}

class LogicalOperator{
	 
	 void andOperator(int value1,int value2) {
		 boolean result=(value1>=value2)&&(--value1+40==value2);//it return true or false
		 System.out.println(result);
		 System.out.println(value1);
		 		 
		}
	 
	 void OrOperator(int value1,int value2) {
		 boolean result=(value1>=value2)||(--value1+40==value2);//it return true or false
		 System.out.println(result);
		 System.out.println(value1);
		 
		}
	 void differenceOfAnds(int value1,int value2) {
		 boolean result=(value1>=value2)&&(--value1+40==value2);
		 boolean result1=(value1>=value2)&(--value2+40==value2);//it return true or false
		 System.out.println(result);
		 System.out.println(result1);
		 System.out.println(value1);
		 System.out.println(value2);
		 
	 }
}
class Ternary{
	void differenceOfAnds(int value1,int value2) {
//		 String result=(value1>value2) ?"greter":"less";
		 System.out.println(value1>value2 ? false: true);
		 
	 }
	
	void instanceofOperator(Object object) {
System.out.println(object instanceof String);
System.out.println(object instanceof Person);

	 }
	void bodmas(int value1,int value2) {
		int result=((value1+value2)*(value1++-value2--))/value2;
System.out.println(result);
			 }
	
}