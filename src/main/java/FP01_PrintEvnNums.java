import java.util.ArrayList;
import java.util.List;

public class FP01_PrintEvnNums {

	public static void main(String[] args) {

		List<Integer> li = new ArrayList<Integer>();
		li.add(21);
		li.add(11);
		li.add(51);
		li.add(12);
		printEvenNumbersInFunctionalApproachSimpleWay(li);

	}

	private static boolean isEven(int num) {
		return num % 2 ==0;
	}

	private static void printEvenNumbersInFunctionalApproach(List<Integer> numbers) {
		numbers.stream()
			.filter(FP01_PrintEvnNums::isEven)
			.forEach(System.out::println);
	}
	
	private static void printEvenNumbersInFunctionalApproachSimpleWay(List<Integer> numbers) {
		numbers.stream()
		.filter(num -> num %2 == 0 )
			.forEach(System.out::println);
	}
}
