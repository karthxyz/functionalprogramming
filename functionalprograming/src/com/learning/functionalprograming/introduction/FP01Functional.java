package com.learning.functionalprograming.introduction;

import com.sun.tools.javac.util.List;

// Functional approach

public class FP01Functional {

	public static void main(String[] args) {

		List<Integer> numberList = List.of(47,64,23,1,5,67,1,7,8,2,4,7,324,435);
//		printNumberInListUsingStructuredFunctional(numberList);
		printSquareOfEvenNumberInListUsingStructuredFunctional(numberList);
	}

	private static void printSquareOfEvenNumberInListUsingStructuredFunctional(List<Integer> numberList) {
		System.out.println("--------printSquareOfEvenNumberInListUsingStructuredFunctional--------");
		numberList.parallelStream()
		.filter(number->number%2==0)
		.map(number -> number * number)
		.forEach(FP01Functional::print);
		
	}

	private static void printNumberInListUsingStructuredFunctional(List<Integer> numberList) {
//		numberList.stream().forEach(number->System.out.println(number));
// print all number in the list
//		numberList.stream().forEach(FP01Functional::print);
// print even number from the list
		numberList.parallelStream().filter(number->number%2==0).forEach(FP01Functional::print);
		
//FP01Functional::print -> Method reference		
		
	}

	private static void print(int number) {
		System.out.println(number);
	}
}
