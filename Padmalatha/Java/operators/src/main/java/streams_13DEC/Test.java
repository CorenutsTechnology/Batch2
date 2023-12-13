package streams_13DEC;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          System.out.println(IntStream.range(2, 8).reduce(0, (a,b)->a+b));
          
          List<String> s= Arrays.asList("Feuji","CoreNuts","Technologies");
          System.out.println(
          s.stream().collect(Collectors.joining(",")));
          
	}

}
