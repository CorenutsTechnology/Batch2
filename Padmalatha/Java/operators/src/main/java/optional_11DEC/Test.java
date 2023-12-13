package optional_11DEC;

import java.util.Optional;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Optional<String> optional=Optional.ofNullable("Sample.txt");
        System.out.println(optional.isPresent());
        System.out.println(optional.isEmpty());
        String s1= optional.orElse("hello");
        System.out.println(s1);
        Optional<String> o=Optional.ofNullable(null);
        System.out.println(o.isPresent());
        System.out.println(o.isEmpty());
        String s= o.orElse("hello");
        System.out.println(s);
        
	}

}
