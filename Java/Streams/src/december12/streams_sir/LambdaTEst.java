package december12.streams_sir;

import java.util.concurrent.Executors;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaTEst {

	public static void main(String[] args) 
	{
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Inner Klass");
			}
		});
		thread.start();
		
		Runnable runnable = () -> System.out.println("Inner Klass");
		Thread thread2 = new Thread(runnable);
		thread2.start();

		Executors.newSingleThreadExecutor().submit(() -> {
			System.out.println("Inner Klass");
			return "String";
		});
		// 1
		MyInterface interface1 = (v1, v2) -> {
			double result = v1 * v2;
			return result;
		};
		interface1.calculate(10, 100);

		// 2
		LambdaTEst test = new LambdaTEst();
		test.execute((v1, v2) -> {
			double result = v1 * v2;
			return result;
		});

		Function<Integer, Integer> function = (v) -> {
			return v * 10;
		};
		System.out.println(function.apply(10));

		BiFunction<Double, Double, Integer> biFunction = (v1, v2) -> {
			int result = Double.valueOf(v1 * v2).intValue();
			return result;
		};
		Integer apply = biFunction.apply(3.5, 6.7);
		System.out.println(apply);

		Predicate<String> predicate = (v1) -> {
			if ("test".equalsIgnoreCase(v1)) {
				return true;
			}
			return false;
		};
		System.out.println(predicate.test("test1"));

		BiFunction<Double, Double, Double> interface3 = LambdaTEst::calculate;
		System.out.println(interface3.apply(12.45, 12.5));

		MyInterface interface2 = LambdaTEst::calculate;
		test.execute(interface2);

		BiFunction<Double, Double, Double> interface4 = new LambdaTEst()::calculate2;
		System.out.println(interface4.apply(12.45, 12.5));

		Function<String, LambdaTEst> function2 = LambdaTEst::new;
		function2.apply("test");

		Supplier<LambdaTEst> function3 = LambdaTEst::new;
		LambdaTEst lambdaTEst = function3.get();
		double v2 = lambdaTEst.calculate2(12.0, 12.33);

		System.out.println(v2);

	}

	public void execute(MyInterface myInterface) {
		double result = myInterface.calculate(100, 200);
		System.out.println(result);
	}

	public static Double calculate(Double v1, Double v2) {
		double result = v1 * v2;
		return result;
	}

	public Double calculate2(Double v1, Double v2) {
		double result = v1 * v2;
		return result;
	}

	public LambdaTEst(String value) {
		System.out.println("Parameter based Constructor");
	}

	public LambdaTEst() {
		System.out.println("Default Constructor");
	}

}

