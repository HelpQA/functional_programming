package PlayWithSteams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FP02_BehaviourParamerterization {

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(21);
		numbers.add(11);
		numbers.add(51);
		numbers.add(12);
		numbers.add(2);
		numbers.add(5);
		
		filterAndPrint(numbers, x -> x % 2 == 0);
		
		filterAndPrint(numbers, x -> x % 2 != 0);
		
		List squareNumbers = convertListToSpecficFormat(numbers, x -> x * x);
		System.out.println(squareNumbers);

	}

	private static List<Integer> convertListToSpecficFormat(List<Integer> numbers, Function<Integer, Integer> mapper) {
		return numbers.stream().map(mapper).collect(Collectors.toList());
	}

	private static void filterAndPrint(List<Integer> numbers, Predicate<Integer> predicate) {
		numbers.stream()
		.filter(predicate)
		.forEach(System.out::println);
	}

	
}
