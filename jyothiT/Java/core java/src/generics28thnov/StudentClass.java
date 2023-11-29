package generics28thnov;

public class StudentClass<T> implements Studentinterface<T> 
{

	public static void main(String[] args) {
	
	StudentClass<Integer> s1=new StudentClass<>();
//	s1.name(10, 20);
	StudentClass<String> s2=new StudentClass<String>();
	s2.name("String","String");
	StudentClass<Double> s3=new StudentClass<Double>();
	s2.fees(25000.00);

}


@Override
public <T extends Comparable<String>> void name(T value1, T value2) {

	System.out.println(value1+" "+value2);
}


@Override
public <T extends Comparable<Double>> void fees(T value) {

	System.out.println(value);
}




}
