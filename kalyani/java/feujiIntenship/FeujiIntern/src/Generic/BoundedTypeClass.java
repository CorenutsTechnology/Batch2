package Generic;
import java.util.ArrayList;
import nov7Th.Person;

public class BoundedTypeClass {
	

		public static void main(String[] args) {
			BoundedTypeClass type = new BoundedTypeClass();
			type.comparable("value1", "value2");
			type.<Person>comparable(new Person("kalyani", 20), new Person("kalyani", 20));
			ArrayList<String> StringList = new ArrayList();
			StringList.add("Bengolere");
			StringList.add("hyderabad");
			//type.display(StringList);

			ArrayList<Integer> IntegerList = new ArrayList();
			IntegerList.add(200);
			IntegerList.add(500);
			IntegerList.add(600);
			type.display(IntegerList);
			

		}

		public <T extends Comparable> void comparable(T value, T value2) {

		}

		public <Interger> void display(ArrayList<?  extends Comparable> list) {/*Super Integer*/
			for (Object obj : list) {
				System.out.println(obj);
			}
		}
		


	}


