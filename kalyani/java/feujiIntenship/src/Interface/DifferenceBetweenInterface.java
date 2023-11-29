package Interface;

public interface DifferenceBetweenInterface {
	void method();
	default void method1() {
		System.out.println("method()");
	}

}
