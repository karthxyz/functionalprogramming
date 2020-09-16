package com.learning.functionalprograming.introduction;

import com.sun.tools.javac.util.List;

public class FP01Structured {

	public static void main(String[] args) {

		List<Integer> numberList = List.of(47,64,23,1,5,67,1,7,8,2,4,7,324,435);
		printNumberInListUsingStructuredPrograming(numberList);
	}

	private static void printNumberInListUsingStructuredPrograming(List<Integer> numberList) {
		for (Integer integer : numberList) {
			System.out.println(integer);
			
		}
		
	}

}
