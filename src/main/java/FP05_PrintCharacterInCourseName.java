import java.util.ArrayList;
import java.util.List;

public class FP05_PrintCharacterInCourseName {

	public static void main(String[] args) {

		List<String> li = new ArrayList<String>();
		li.add("Spring");
		li.add("Spring Boot");
		li.add("API");
		li.add("Microservice");
		li.add("AWS");

		printAllCourses(li);
		
		System.out.println("------------------------");
		printCourseContainWords(li,"Spring");
		
		System.out.println("------------------------");
		printCourseGreaterSize(li,4);
		
		System.out.println("------------------------");
		printCharacterOfCouseName(li);
	}
	

	private static void printAllCourses(List<String> course) {
		course.stream()
			.forEach(System.out::println);
	}
	
	private static void printCourseContainWords(List<String> courses,String word) {
		courses.stream()
		.filter( course -> course.contains(word))
		.forEach(System.out::println);
	}
	
	private static void printCourseGreaterSize(List<String> courses, int size) {
		courses.stream()
		.filter(course -> course.length() > 4)
		.forEach(System.out::println);
	}
	
	private static void printCharacterOfCouseName(List<String> courses) {
		courses.stream()
		.map(course -> course + " " + course.length())
		.forEach(System.out::println);
	}
}
