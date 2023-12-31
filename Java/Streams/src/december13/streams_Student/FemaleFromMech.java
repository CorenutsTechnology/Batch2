//5.List female students from the Mech department using streams?

package december13.streams_Student;
import java.util.List;
import java.util.stream.Collectors;

public class FemaleFromMech 
{
	public static void main(String[] args)
	{
		List<Student> list=StudentList.createList();
		
		list.stream().collect(Collectors.groupingBy(Student::getDept)).entrySet().stream().forEach((e)->{
			if(e.getKey().equals("Mech") )
			{
				e.getValue().forEach((st)->{
				if(st.getGender().equals('F'))
					System.out.println(st.getName());
				});
			}	
		});
		
		
		//another way
		list.stream().filter((dept)->dept.getDept().equals("Mech")).filter((gender)->gender.getGender().equals('F')).
		forEach((e)->System.out.println(e.getName()));
	}
}

