package com.learning.functionalprograming.introduction;

import com.sun.tools.javac.util.List;

public class FP01Functional {

	public static void main(String[] args) {

		List<Integer> numberList = List.of(47,64,23,1,5,67,1,7,8,2,4,7,324,435);
		printNumberInListUsingStructuredFunctional(numberList);
	}

	private static void printNumberInListUsingStructuredFunctional(List<Integer> numberList) {
//		numberList.stream().forEach(number->System.out.println(number));
		numberList.stream().forEach(FP01Functional::print);
		
	}

	private static void print(int number) {
		System.out.println(number);
	}
}
