package com.learning.functionalprograming.morefunctionalprogramming;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

import com.sun.tools.javac.code.Attribute.Array;

public class FP05moreFP {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(47, 64, 23, 1, 5, 67, 1, 7, 8, 2, 4, 7, 6, 10);
		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker",
				"Kubernetes");
		
		List<String> courses2 = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker",
				"Kubernetes");
		
		int[] intArray = {47, 64, 23, 1, 5, 67, 1, 7, 8, 2, 4, 7, 6, 10};
		
		System.out.println(Arrays.stream(intArray).count());
		
		System.out.println(IntStream.of(47, 64, 23, 1, 5, 67, 1, 7, 8, 2, 4, 7, 6, 10));

		System.out.println(IntStream.of(47, 64, 23, 1, 5, 67, 1, 7, 8, 2, 4, 7, 6, 10).sum());

		System.out.println(IntStream.of(47, 64, 23, 1, 5, 67, 1, 7, 8, 2, 4, 7, 6, 10).count());
		
		IntStream.iterate(1	, e->e+2).limit(10).peek(System.out::println).sum();
		IntStream.iterate(2	, e->e+2).limit(10).peek(System.out::println).sum();
		IntStream.iterate(2	, e->e*2).limit(10).peek(System.out::println).sum();
		System.out.println(IntStream.iterate(2	, e->e*2).limit(10).boxed().collect(Collectors.toList()));
		
		System.out.println(LongStream.range(1, 51)
				                     .mapToObj(BigInteger::valueOf)
				                     .reduce(BigInteger.ONE, BigInteger::multiply));
		
		System.out.println(
		courses.stream().map(course->course.split("")).flatMap(Arrays::stream).distinct().sorted().collect(Collectors.toList()));
		
		System.out.println(
		courses.stream().flatMap(course-> courses2.stream().filter(course2->course2.length()==course.length()).map(course2->List.of(course,course2))).filter(list -> list.get(0)!=list.get(1)).collect(Collectors.toList())		
				
				);
		System.out.println(
				LongStream.range(0, 1000000000).parallel().sum()
		);
		
		List<String>  modifyList = new ArrayList(courses2);
		modifyList.replaceAll(String::toUpperCase);
		System.out.println(modifyList);
		modifyList.removeIf(course->course.length()>6);
		System.out.println(modifyList);
		
}

}
