package PlayWithSteams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class FP01_AddListNumbers {

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

		int sum = sumNumbers(li);
		System.out.println(sum);

		System.out.println("----------------------");
		squareAndAdd(li);

	}

	private static int sumNumbers(List<Integer> numbers) {

		BinaryOperator<Integer> sumBinaryOperator2 = new BinaryOperator<Integer>(){

			@Override
			public Integer apply(Integer t, Integer u) {
				return t + u;
			}
			
		};
		
		return numbers.stream().reduce(0, sumBinaryOperator2);

	}

	private static void squareAndAdd(List<Integer> numbers) {

		int r = numbers.stream().map(x -> x * x)
				.reduce(0, (x, y) -> x + y);

		System.out.println("Sum of Squares is =>" + r);
	}
}
