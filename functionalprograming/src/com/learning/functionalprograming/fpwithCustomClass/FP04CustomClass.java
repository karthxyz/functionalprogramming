package com.learning.functionalprograming.fpwithCustomClass;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FP04CustomClass {

	public static void main(String[] args) {
		List<Courses> courses = List.of(new Courses("Spring", "FrameWork", 94, 25000),
				new Courses("SpringBoot", "FrameWork", 91, 32000), new Courses("AWS", "Cloud", 91, 33000),
				new Courses("GCP", "Cloud", 92, 24000), new Courses("Azure", "Cloud", 93, 33000),
				new Courses("Java", "Language", 98, 25000), new Courses(".net", "Language", 90, 36000)

		);

		Predicate<Courses> reviewScoreMoreThan90Predicate = course -> course.getReviewScore() > 90;
		Predicate<Courses> reviewScoreMoreThan95Predicate = course -> course.getReviewScore() > 95;
		Predicate<Courses> reviewScoreLessThan70Predicate = course -> course.getReviewScore() < 70;
		Predicate<Courses> reviewScoreMoreThan85Predicate = course -> course.getReviewScore() > 85;

		System.out.println(courses.stream().allMatch(reviewScoreMoreThan95Predicate));
		System.out.println(courses.stream().noneMatch(reviewScoreMoreThan90Predicate));
		System.out.println(courses.stream().anyMatch(reviewScoreMoreThan95Predicate));

		Comparator<Courses> comparingOnNoOfStudentsAsc = Comparator.comparing(Courses::getNoOfStudents);
		Comparator<Courses> comparingOnNoOfStudentsDesc = Comparator.comparing(Courses::getNoOfStudents).reversed();

		System.out.println(courses.stream().sorted(comparingOnNoOfStudentsAsc).collect(Collectors.toList()));
		System.out.println(courses.stream().sorted(comparingOnNoOfStudentsDesc).collect(Collectors.toList()));

		Comparator<Courses> comparingOnNoOfStudentsDescAndReviews = Comparator.comparingInt(Courses::getNoOfStudents)
				.thenComparingInt(Courses::getReviewScore).reversed();

		System.out.println(courses.stream().sorted(comparingOnNoOfStudentsDescAndReviews).collect(Collectors.toList()));

		System.out.println(
				courses.stream().sorted(comparingOnNoOfStudentsDescAndReviews).skip(5).collect(Collectors.toList()));
		System.out.println(
				courses.stream().sorted(comparingOnNoOfStudentsDescAndReviews).limit(5).collect(Collectors.toList()));
		System.out.println(courses.stream().takeWhile(reviewScoreMoreThan90Predicate).collect(Collectors.toList()));
		System.out.println(courses.stream().dropWhile(reviewScoreMoreThan90Predicate).collect(Collectors.toList()));
		System.out.println(courses.stream().max(comparingOnNoOfStudentsAsc));
		System.out.println(courses.stream().min(comparingOnNoOfStudentsAsc));
		System.out.println(courses.stream().filter(reviewScoreMoreThan85Predicate).findFirst().get());
		System.out.println(
				courses.stream().filter(reviewScoreMoreThan85Predicate).mapToInt(Courses::getNoOfStudents).sum());
		System.out.println(
				courses.stream().filter(reviewScoreMoreThan85Predicate).mapToInt(Courses::getNoOfStudents).count());
		System.out.println(courses.stream().filter(reviewScoreMoreThan85Predicate).mapToInt(Courses::getNoOfStudents)
				.average().getAsDouble());
		System.out.println(courses.stream().collect(Collectors.groupingBy(Courses::getCategory)));

		System.out.println(courses.stream().collect(Collectors.groupingBy(Courses::getCategory,
				Collectors.maxBy(Comparator.comparing(Courses::getReviewScore)))));

		System.out.println(courses.stream().collect(Collectors.groupingBy(Courses::getCategory,
				Collectors.mapping(Courses::getName, Collectors.toList()))));
		Predicate<Courses> reviewScoreMoreThan90Predicate2 =  cutOffPredicateforReviewScore(90);

		Predicate<Courses> reviewScoreMoreThan95Predicate2 =  cutOffPredicateforReviewScore(95);

	}

	private static Predicate<Courses> cutOffPredicateforReviewScore(int cutOffReviewScore) {
		return course -> course.getReviewScore() > cutOffReviewScore;
	}

}
