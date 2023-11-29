package Generic;

import java.util.ArrayList;

public class GenTest {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(100);
		list.add("test");
		
		GenTest genTest= new GenTest();
		genTest.display(list);
		
	}
	public void display(ArrayList List) {
		for(Object obj:List) {
			String value=(String) obj;
			System.out.println(obj);
			
		}
	}

}
