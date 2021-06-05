package PlayWithSteams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FP01_FuntionalInterface {

	/*
	 * boolean isEven(int x){ return x%2 == 0; }
	 * 
	 * int squared(int x){ return x* x; }
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = new ArrayList<Integer>();

		numbers.add(22);
		numbers.add(11);
		numbers.add(33);
		numbers.add(55);
		numbers.add(44);

		// Background these are the interface which are mapped when you use lambda in
		// your code i.e predicate, function, consumer
		Predicate<Integer> predicate = x -> x % 2 == 0;
		
		Predicate<Integer> predicate2 = new Predicate<Integer>() {
			@Override
			public boolean test(Integer x) {
				// TODO Auto-generated method stub
				return x %2 ==-0;
			}
			
		};
		

		Function<Integer, Integer> mapper = x -> x * x;

		Function<Integer, Integer> mapper2 = new Function<Integer, Integer>() {

			@Override
			public Integer apply(Integer x) {
				return x * x;
			}

		};

		Consumer<Integer> sysoutConsumer = System.out::println;
		
		Consumer<Integer> sysoutConsumer2 = new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
		};

		numbers.stream()
		.filter(predicate2)
		.map(mapper2)
		.forEach(sysoutConsumer2);

	}

}
