package com.learning.functionalprograming.morestreams;

import com.sun.tools.javac.util.List;

public class FP02Excercise {

	public static void main(String[] args) {
		List<Integer> numberList = List.of(47,64,23,1,5,67,1,7,8,2,4,7,6,10);
//		System.out.println("Sum of Square of number: " + sumOfSquareOfNumbers(numberList));
//		System.out.println("Sum of Cube of number: " + sumOfCubeOfNumbers(numberList));
		System.out.println("Sum of odd number: " + sumOfOddNumbers(numberList));


	}

	private static int sumOfOddNumbers(List<Integer> numberList) {
		return numberList.stream().filter(number->number%2==1).reduce(0, Integer::sum);
	}

	private static int sumOfCubeOfNumbers(List<Integer> numberList) {
		
		return numberList.stream().map(number->number*number*number).reduce(0, Integer::sum);
	}

	private static int sumOfSquareOfNumbers(List<Integer> numberList) {
		return numberList.stream().map(number -> number * number).reduce(0, Integer::sum);
	}

}
