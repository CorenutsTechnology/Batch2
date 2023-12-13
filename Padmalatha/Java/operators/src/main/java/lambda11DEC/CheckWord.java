package lambda11DEC;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class CheckWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<>();
		list.add("CoreNuts Technologies");
		list.add("CoreNuts Technologies Pvt Limited");
		list.add("CoreNuts Technologies Pvt");
		
	   int k=list.stream().filter(s->s.contains("Nuts")).collect(Collectors.toList()).size();
	   if(list.size()==k)
	   {
		   System.out.println("true");
	   }
	   else {
		   System.out.println("false");
	   }
		
	}

}
