import java.util.ArrayList;
import java.util.List;

public class FP04_PrintNumSquare {

	public static void main(String[] args) {

		List<Integer> li = new ArrayList<Integer>();
		li.add(21);
		li.add(11);
		li.add(51);
		li.add(12);
		printEvenNumbersInFunctionalApproachSimpleWay(li);

	}

	
	private static void printEvenNumbersInFunctionalApproachSimpleWay(List<Integer> numbers) {
		numbers.stream()
		.map(x -> x* x)
			.forEach(System.out::println);
	}
}
