package december8.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionInterface 
{
	//find whether pravalika name is there or not
	Function<List<Student>,Boolean> function=(List<Student> list)->{
		Boolean result=false;
		for(Student student:list)
		{
			if(student.getName().equals("Pravalika"))
				result=true;
		}
		return result;
	};
	
	public static void main(String[] args) {
		
//		Function<String , Boolean> function = (String str)->{
//			if("teest".equals(str))
//				return true;
//			return false;
//		};
//		Boolean result = function.apply("test");
//		System.out.println(result);
		
		List<Student> list = new ArrayList<>();
		list.add(new Student(121,"Pravalika",89.9));
		list.add(new Student(122,"Gowri",86.9));
		list.add(new Student(123,"Rubeena",87.9));
		list.add(new Student(124,"Ambika",83.9));
		list.add(new Student(121,"Pravalika",89.9));
		
		System.out.println("checking whether pravalika is present or not");
		Boolean result =new FunctionInterface().function.apply(list);
		System.out.println("Result is: "+result);
		
	}
}
