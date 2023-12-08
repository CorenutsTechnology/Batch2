package com.crnuts.testClass;

import java.util.Collections;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import com.crnuts.interfaces.EvenNo;
import com.crnuts.interfaces.PrintNum;

public class LambdaTest {

	public static void main(String[] args) {

		EvenNo evenNo2 = (int n) -> n % 2 == 0;

		System.out.println(evenNo2.isEvenNo(42) ? "Even Number" : "Odd Number");

		PrintNum num = n -> {
			for (int i = 1; i <= n; i++) {
				System.out.println(i);
			}
		};
		num.printNum(10);

		System.out.println("------FUNCTIONAL INTERFACES------");

		System.out.println("***Predicate interface***");
		Predicate<Integer> predicate = n -> n % 2 == 0;
		if (predicate.test(49) == true) {
			System.out.println("even no");
		} else {
			System.out.println("odd no");
		}

		System.out.println("***Consumer interface***");
		Consumer<Integer> consumer = n -> {
			for (int i = 1; i <= n; i++) {
				System.out.println(i);
			}
		};

		consumer.accept(10);

		System.out.println("***Supplier interface***");
		Supplier<String> supplier = () -> "See you soon Maa :) ";

		System.out.println(supplier.get());

		System.out.println("***Function interface***");
		Function<Integer, Integer> function = x -> x + 5;
		System.out.println("sum of x + 5: " + function.apply(8));
		
		  
	}

}
