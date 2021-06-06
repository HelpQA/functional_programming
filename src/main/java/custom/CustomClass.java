package custom;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Course {
	private String name;
	private String category;
	private int reviewScore;
	private int noOfStudents;

	public Course(String name, String category, int reviewScore, int noOfStudents) {
		super();
		this.name = name;
		this.category = category;
		this.reviewScore = reviewScore;
		this.noOfStudents = noOfStudents;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getReviewScore() {
		return reviewScore;
	}

	public void setReviewScore(int reviewScore) {
		this.reviewScore = reviewScore;
	}

	public int getNoOfStudents() {
		return noOfStudents;
	}

	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}

	@Override
	public String toString() {
		return "Course [name=" + name + ", category=" + category + ", reviewScore=" + reviewScore + ", noOfStudents="
				+ noOfStudents + "]";
	}

}

public class CustomClass {

	public static void main(String[] args) {

		List<Course> courses = new ArrayList<Course>();
		courses.add(new Course("Spring", "FrameWork", 98, 2000));
		courses.add(new Course("SpringBoot", "FrameWork", 95, 1900));
		courses.add(new Course("API", "MicroServices", 97, 2001));
		courses.add(new Course("FullStack", "FullStack", 99, 1300));
		courses.add(new Course("AWS", "Cloud", 91, 1400));
		courses.add(new Course("Azure", "Cloud", 88, 1500));
		courses.add(new Course("Docker", "Cloud", 78, 5000));
		courses.add(new Course("MicroServices", "MicroServices", 97, 2001));

		// allMatch, noneMatch , anyMatch
		System.out.println(courses.stream().allMatch(course -> course.getReviewScore() > 50));
		System.out.println(courses.stream().noneMatch(course -> course.getReviewScore() > 50));

		// sorting
		Comparator<Course> comparingByNoOfStudentsIncreasingorder = Comparator.comparing(Course::getNoOfStudents);
		System.out.println(courses.stream().sorted(comparingByNoOfStudentsIncreasingorder).collect(Collectors.toList()));
		
		//Sorting in decreasing Order
		Comparator<Course> comparingByNoOfStudentsDecreasingOrder = Comparator.comparing(Course::getNoOfStudents).reversed();		
		System.out.println(courses.stream().sorted(comparingByNoOfStudentsDecreasingOrder).collect(Collectors.toList()));
		
		//Sorting in NoOfStudentsAndNoOfReview
	    Comparator<Course> comparingByNoOfStudentsAndNoOfReviews 
	    					= Comparator.comparing(Course::getNoOfStudents)
	    								.thenComparing(Course::getReviewScore).reversed();	
	    
	    System.out.println(courses.stream().sorted(comparingByNoOfStudentsAndNoOfReviews).collect(Collectors.toList()));
	    
	    //After sorting I want to pick only first 5
	    System.out.println(courses.stream()
	    		.sorted(comparingByNoOfStudentsAndNoOfReviews).limit(5)
	    		.collect(Collectors.toList()));
	    
		
	}

}
