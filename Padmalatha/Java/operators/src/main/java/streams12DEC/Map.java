package streams12DEC;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IntStream.range(1, 6).map(i-> i+5).forEach(System.out::println);;
	}

}
