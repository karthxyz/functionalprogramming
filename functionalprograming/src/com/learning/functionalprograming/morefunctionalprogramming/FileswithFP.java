package com.learning.functionalprograming.morefunctionalprogramming;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class FileswithFP {

	public static void main(String[] args) throws IOException {
		Files.list(Paths.get(".")).forEach(System.out::println);
		Files.lines(Paths.get("FP04Learning.txt")).map(str->str.split(" "))
		.flatMap(Arrays::stream)
		.filter(str->!str.isEmpty())
		.map(String::trim)
		.distinct()
		.forEach(System.out::println);

	}

}
