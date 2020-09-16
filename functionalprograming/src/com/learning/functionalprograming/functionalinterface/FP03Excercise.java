package com.learning.functionalprograming.functionalinterface;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FP03Excercise {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(47, 64, 23, 1, 5, 67, 1, 7, 8, 2, 4, 7, 6, 10);

		BinaryOperator<Integer> calculateSum = Integer::sum;
		BinaryOperator<Integer> calculateSum2 = new BinaryOperator<Integer>() {

			@Override
			public Integer apply(Integer t, Integer u) {

				return t + u;
			}
		};
		int sum = numbers.stream().reduce(0, calculateSum2);
		System.out.println("sum: " + sum);

		List<Integer> squaredNumber = calculateAndCollectToList(numbers, number -> number * number);
		System.out.println("squaredNumber:" + squaredNumber);
		List<Integer> cubeNumber = calculateAndCollectToList(numbers, number -> number * number * number);
		System.out.println("cubeNumber:" + cubeNumber);
		List<Integer> sumNumber = calculateAndCollectToList(numbers, number -> number + number);
		System.out.println("sumNumber:" + sumNumber);
		
		BiPredicate<Integer, String> biPredicate = (number,str) -> {
			return number>=10 && str.length()<10;
		};
		System.out.println("biPredicate:" + biPredicate.test(20, "Preethi"));
		
		BiFunction<Integer, String, String> biFunction = (number,str)-> {
			return number + str;
		};
		
		System.out.println("BiFunction:" + biFunction.apply(10, "Preethi"));
		
		BiConsumer<Integer, String> biConsumer = (number,str)->{
			System.out.println(number + " " +str);
		};
		biConsumer.accept(10, "preethi");
	}

	private static List<Integer> calculateAndCollectToList(List<Integer> numbers,
			Function<? super Integer, ? extends Integer> mapper) {
		return numbers.stream().map(mapper).collect(Collectors.toList());
	}

}
