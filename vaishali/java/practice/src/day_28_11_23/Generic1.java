package day_28_11_23;
import java.util.ArrayList;

public class Generic1 {

	public static void main(String[] args) {
		Generic1 gen=new Generic1();
		gen.method1();
		System.out.println("using generic");
		gen.generic();
	}
	public void method1() {
		ArrayList list=new ArrayList();
		list.add("rani");
		list.add(29);
		list.add(12.4);
		list.add(true);
		for(Object obj:list) {
			System.out.println(obj);
		}
	}
	public void generic() {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(12);
		list.add(4);
//		list.add("3"); //stores integer type only
		for (Integer integer : list) {
			System.out.println(integer);
		}
	}
}
