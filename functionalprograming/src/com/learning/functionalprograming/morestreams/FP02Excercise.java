package com.learning.functionalprograming.morestreams;

import java.util.Comparator;
import java.util.stream.Collectors;

import java.util.List;

public class FP02Excercise {

	public static void main(String[] args) {
		List<Integer> numberList = List.of(47, 64, 23, 1, 5, 67, 1, 7, 8, 2, 4, 7, 6, 10);
		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker",
				"Kubernetes");
//		System.out.println("Sum of Square of number: " + sumOfSquareOfNumbers(numberList));
//		System.out.println("Sum of Cube of number: " + sumOfCubeOfNumbers(numberList));
//		System.out.println("Sum of odd number: " + sumOfOddNumbers(numberList));
//		printDistinctNumbersInTheList(numberList);
//		printSortedNumberfromList(numberList);
//		printReverseSortedNumberfromList(numberList);
//		printReverseOrderofStringsfromList(courses);
//		printSortedByLengthOfStringinTheList(courses);
		List<Integer> doubleNumberList = doubleNumbersInTheList(numberList);
		System.out.println(doubleNumberList);
		java.util.List<Integer> evenNumberList = numberList.stream().filter(number -> number % 2 == 0)
				.collect(Collectors.toList());
		System.out.println(evenNumberList);
		List<Integer> lengthOFStringList = courses.stream().map(course -> course.length()).collect(Collectors.toList());
		System.out.println("lengthOFStringList: " + lengthOFStringList);
	}

	private static List<Integer> doubleNumbersInTheList(List<Integer> numbers) {
		return numbers.stream().map(number -> number * number).collect(Collectors.toList());
	}

	private static void printSortedByLengthOfStringinTheList(List<String> courses) {
		courses.stream().sorted(Comparator.comparing(course -> course.length())).forEach(System.out::println);

	}

	private static void printReverseOrderofStringsfromList(List<String> courses) {
		courses.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

	}

	private static void printReverseSortedNumberfromList(List<Integer> numberList) {
		numberList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

	}

	private static void printSortedNumberfromList(List<Integer> numberList) {
//		numberList.stream().sorted().forEach(System.out::println);
		numberList.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);

	}

	private static void printDistinctNumbersInTheList(List<Integer> numberList) {
		numberList.stream().distinct().forEach(System.out::println);

	}

	private static int sumOfOddNumbers(List<Integer> numberList) {
		return numberList.stream().filter(number -> number % 2 == 1).reduce(0, Integer::sum);
	}

	private static int sumOfCubeOfNumbers(List<Integer> numberList) {

		return numberList.stream().map(number -> number * number * number).reduce(0, Integer::sum);
	}

	private static int sumOfSquareOfNumbers(List<Integer> numberList) {
		return numberList.stream().map(number -> number * number).reduce(0, Integer::sum);
	}

}
