package streams12DEC;

import static org.junit.jupiter.api.DynamicTest.stream;

import java.util.stream.IntStream;

public class Sum {
   public static void main(String[] args) {
	   System.out.println(IntStream.range(1, 6).reduce(0, (a,b)->a+b));
	   //it won't include the last number
}
}
