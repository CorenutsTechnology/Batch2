package generics28thnov;

public interface Studentinterface<T> {
	
	<T extends Comparable<String>>void name(T value1,T value2);
    <T extends Comparable<Double>> void fees(T value);
    
}
