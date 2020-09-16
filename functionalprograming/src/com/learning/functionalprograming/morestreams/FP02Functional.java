package com.learning.functionalprograming.morestreams;

import java.util.function.BinaryOperator;

import com.sun.tools.javac.util.List;

// Functional approach

public class FP02Functional {

	public static void main(String[] args) {

		List<Integer> numberList = List.of(47,64,23,1,5,67,1,7,8,2,4,7,6,10);
//		System.out.println("Sum of all number: " + sumAllNumbersInList(numberList));
//		System.out.println("min number: " + findMinNumber(numberList));
		System.out.println("max number: " + findMaxNumber(numberList));

	}
	
	private static Integer findMaxNumber(List<Integer> numberList) {
		
		return numberList.stream().reduce(Integer.MIN_VALUE, (x,y)-> x>y?x:y);
	}

	private static Integer findMinNumber(List<Integer> numberList) {
		
		return numberList.stream().reduce(Integer.MAX_VALUE,FP02Functional::findMin);
	}

	private static Integer findMin(int x,int y) {
		System.out.println(x + " " + y);
		return x<y?x:y;
	}

	private static Integer sum(int a,int b) {
// here 'a' is aggregate		
		System.out.println(a + " " + b);
		return a + b;
	}

	private static Integer sumAllNumbersInList(List<Integer> numberList) {
		
//		return numberList.stream().reduce(0,(initial,number)->(initial+number));
//		return numberList.stream().reduce(0,Integer::sum);
		return numberList.stream().reduce(0,FP02Functional::sum);


	}
}
	