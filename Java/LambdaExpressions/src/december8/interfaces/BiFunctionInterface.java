package december8.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionInterface 
{
	//find whether pravalika name is there or not
		BiFunction<List<Student>,String,Boolean> biFunction=(List<Student> list ,String name)->{
			Boolean result=false;
			for(Student student:list)
			{
				if(student.getName().equals(name))
					result=true;
			}
			return result;
		};
		
		public static void main(String[] args) 
		{
			
			List<Student> list = new ArrayList<>();
			list.add(new Student(121,"Pravalika",89.9));
			list.add(new Student(122,"Gowri",86.9));
			list.add(new Student(123,"Rubeena",87.9));
			list.add(new Student(124,"Ambika",83.9));
			list.add(new Student(121,"Pravalika",89.9));
			
			System.out.println("checking whether pravalika is present or not");
			Boolean result =new BiFunctionInterface().biFunction.apply(list,"pravalika");
			System.out.println("Result is  : "+result);
			
		}
}
