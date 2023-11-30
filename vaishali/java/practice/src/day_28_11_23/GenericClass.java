package day_28_11_23;

public class GenericClass<T> implements GenericInterface<T> {

	@Override
	public T calculate(T obj) {
		return obj;
	}

}
