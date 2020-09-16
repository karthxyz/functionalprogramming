package com.learning.functionalprograming.functionalinterface;

import java.util.List;
import java.util.function.Predicate;

public class FP03BehavioralParameterization {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(47, 64, 23, 1, 5, 67, 1, 7, 8, 2, 4, 7, 6, 10);
		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker",
				"Kubernetes");
		System.out.println("Even Number:-");
		filterAndPrint(numbers, number->number%2==0);
		System.out.println("Odd Number:-");
		filterAndPrint(numbers, number->number%2!=0);
		System.out.println("Divisible by 3:-");
		filterAndPrint(numbers, number->number%3==0);

	}

	private static void filterAndPrint(List<Integer> numbers, Predicate<Integer> predicate) {
		numbers.stream().filter(predicate).forEach(System.out::println);
	}

}
