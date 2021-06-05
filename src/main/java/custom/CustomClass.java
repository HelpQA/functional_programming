package custom;

import java.util.ArrayList;
import java.util.List;

class Course{
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
		
		System.out.println(courses.stream().allMatch(course -> course.getReviewScore() > 50 ));

	}

}
