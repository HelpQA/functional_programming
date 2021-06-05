import java.util.ArrayList;
import java.util.List;

public class FP02_PrintOddNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int sum = 0;
		/*
		 * for (int i = 1; i <= 5; i++) { System.out.println("Number is ->" + i); sum +=
		 * i; System.out.println("Sum of all numbers are => " + sum); }
		 */

		List<Integer> li = new ArrayList<Integer>();
		li.add(21);
		li.add(11);
		li.add(51);
		li.add(12);
		//printAllNumbersInListStructured(li);
		//printEvenNumbers(li);
		printEvOddNumbersInFunctionalApproach(li);

	}
	

	private static void printEvOddNumbersInFunctionalApproach(List<Integer> numbers) {
		numbers.stream()
			.filter(num -> num %2 != 0)
			.forEach(System.out::println);
	}
}
