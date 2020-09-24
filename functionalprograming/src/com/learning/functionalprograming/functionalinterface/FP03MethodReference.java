package com.learning.functionalprograming.functionalinterface;

import java.util.List;

public class FP03MethodReference {

	public static void main(String[] args) {
		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker",
				"Kubernetes");
//		courses.stream().map(str -> str.toUpperCase()).forEach(System.out::println);
		courses.stream().map(String::toUpperCase).forEach(System.out::println);

	}

}
