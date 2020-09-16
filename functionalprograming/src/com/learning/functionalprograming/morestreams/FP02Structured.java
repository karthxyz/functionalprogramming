package com.learning.functionalprograming.morestreams;

import com.sun.tools.javac.util.List;

// Structured approach

public class FP02Structured {

	public static void main(String[] args) {

		List<Integer> numberList = List.of(47, 64, 23, 1, 5, 67, 1, 7, 8, 2, 4, 7, 10, 6);
//		printNumberInListUsingStructuredPrograming(numberList);
		printSumOfNumbersInTheList(numberList);
	}

	private static void printSumOfNumbersInTheList(List<Integer> numberList) {
		int sum=0;
		for (Integer integer : numberList) {
			sum = sum + integer;
		}
		System.out.println(sum);
	}

	private static void printNumberInListUsingStructuredPrograming(List<Integer> numberList) {
		for (Integer integer : numberList) {

			if (integer % 2 == 0) {
				System.out.println(integer);
			}

		}

	}

}
