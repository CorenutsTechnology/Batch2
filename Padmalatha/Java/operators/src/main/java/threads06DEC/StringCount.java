package threads06DEC;
import java.util.*;
public class StringCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Core nuts technologies located in Banglore Core nuts technologies located in Hyderabad Core nuts technologies located in Banglore Core nuts technologies located in hyderabad";
		
		String[] st=str.split(" ");
		Map<String,Integer> map=new HashMap<>();
		int count=0;
		for(String s:st)
		{
			if(map.containsKey(s))
			{
			   count=map.get(s);
			   count++;
			   map.put(s,count);
			}
			else
			{
				map.put(s,1);
			}
		}
		for(Map.Entry<String, Integer> entry:map.entrySet())
		{
			System.out.println(entry.getKey()+"-"+entry.getValue());
		}
	}

}
