package com.learning.functionalprograming.functionalinterface;

import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FP03Functional {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(47, 64, 23, 1, 5, 67, 1, 7, 8, 2, 4, 7, 6, 10);
		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker",
				"Kubernetes");

		Predicate<Integer> isEvenPredicate = number -> number % 2 == 0;
		Predicate<Integer> isEvenPredicate2 = new Predicate<Integer>() {

			@Override
			public boolean test(Integer number) {
				return number % 2 == 0;
			}
		};
		Function<Integer, Integer> squareMapper = number -> number * number;
		Function<Integer, Integer> squareMapper2 = new Function<Integer, Integer>() {

			@Override
			public Integer apply(Integer number) {
				return number * number;
			}
		};
		Consumer<Integer> printAction = System.out::println;
		Consumer<Integer> printAction2 = new Consumer<Integer>() {

			@Override
			public void accept(Integer number) {
				System.out.println(number);
			}
		};
		numbers.stream().filter(isEvenPredicate2).map(squareMapper2).forEach(printAction2);

		Supplier<Integer> testSupplier = new Supplier<Integer>() {

			@Override
			public Integer get() {
				Random random = new Random();
				return random.nextInt(20);
				
			}
		};
		
		System.out.println("Supplier: " + testSupplier.get());
		
		UnaryOperator<Integer> unaryOperator = new UnaryOperator<Integer>() {
			
			@Override
			public Integer apply(Integer number) {
				return number+number;
			}
		};
		
		System.out.println("unaryOperator: " + unaryOperator.apply(5));
		
		
		
	}

}
