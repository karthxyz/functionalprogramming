package com.learning.functionalprograming.introduction;

import com.sun.tools.javac.util.List;

// Functional approach

public class FP01Excercises {

	public static void main(String[] args) {

		List<Integer> numberList = List.of(47, 64, 23, 1, 5, 67, 1, 7, 8, 2, 4, 7, 6, 10);
		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker",
				"Kubernetes");
//		printCoursesInTheList(courses);
//		printCoursesWhichContainWordSpring(courses);
//		printCoursesWhichHasFourChars(courses);
//		printOddNumberInListUsingStructuredFunctional(numberList);
//		printCubeOfOddNumberInTheList(numberList);
		printLengthOfCourses(courses);
	}

	private static void printLengthOfCourses(List<String> courses) {
		courses.stream().map(course -> course + " " + course.length()).forEach(System.out::println);

	}

	private static void printCubeOfOddNumberInTheList(List<Integer> numberList) {
		System.out.println("--------printCubeOfOddNumberInTheList-----------");
		numberList.stream().filter(number -> number % 2 == 1).map(number -> number * number * number)
				.forEach(System.out::println);

	}

	private static void printCoursesWhichHasFourChars(List<String> courses) {
		System.out.println("--------printCoursesWhichHasFourChars-----------");
		courses.stream().filter(course -> course.length() >= 4).forEach(System.out::println);

	}

	private static void printCoursesWhichContainWordSpring(List<String> courses) {
		System.out.println("--------printCoursesWhichContainWordSpring-----------");
		courses.stream().filter(course -> course.contains("Spring")).forEach(System.out::println);

	}

	private static void printCoursesInTheList(List<String> courses) {
		System.out.println("--------printCoursesInTheList-----------");
		courses.stream().forEach(System.out::println);

	}

	private static void printOddNumberInListUsingStructuredFunctional(List<Integer> numberList) {
		System.out.println("--------printOddNumberInListUsingStructuredFunctional-----------");
		numberList.parallelStream().filter(number -> number % 2 == 1).forEach(FP01Excercises::print);

	}

	private static void print(int number) {
		System.out.println(number);
	}
}
