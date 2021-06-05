import java.util.ArrayList;
import java.util.List;

public class FP01_PrintNums {

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
		printEvenNumbersInFunctionalApproach(li);

	}
	
	private static void printEvenNumbers(List<Integer> numbers) {
		for(int num:numbers) {
			if(num%2 == 0) {
				System.out.println(num);
			}
		}
	}

	// Traditional Approach print all numbers in list
	private static void printAllNumbersInListStructured(List<Integer> numbers) {
		/*for (int i = 0; i < numbers.size(); i++) {
			System.out.println("No in List is -> " + numbers.get(i));
		}

		for (int num : numbers) {
			System.out.println(num);
		}*/
		
		printAllNumbersInFunctionalApproach(numbers);
	}
	
	private static void printAllNumbersInFunctionalApproach(List<Integer> numbers) {
		numbers.stream()
			.forEach(FP01_PrintNums::print);
	}
	
	private static void print(int num) {
		System.out.println(num);
	}
	
	private static boolean isEven(int num) {
		return num % 2 ==0;
	}

	private static void printEvenNumbersInFunctionalApproach(List<Integer> numbers) {
		numbers.stream()
			.filter(FP01_PrintNums::isEven)
			.forEach(FP01_PrintNums::print);
	}
}
