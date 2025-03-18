package live.learnjava.java8_lambdas.higher_order_functions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
	// create a function that takes functional interface a arguments
	public static int applyFunction(int x, Function<Integer, Integer> func) {
		return func.apply(x);
	}

	public static Function<Integer, Integer> multipler(int factor) {
		return (n) -> n * factor;
	}

	public static void main(String[] args) {

		Function<Integer, Integer> doubleFunction = (n) -> n * 2;
		int result = applyFunction(10, doubleFunction);
		System.out.println(result);

		//get the function that triples the input
		Function<Integer, Integer> tripleFunction = multipler(3);
		int result2 = tripleFunction.apply(4);
		System.out.println(result2);

		List<String> words = Arrays.asList("apple", "orange", "banana", "grapes", "cherry", "date");
		Collections.sort(words,(s1, s2)->s1.length() - s2.length());
		System.out.println(words);

		//define
		Predicate<String> isEmpty = (s) -> s.isEmpty();
		//use
		boolean x = isEmpty.test("");
		System.out.println(x);
		boolean y = isEmpty.test("Gop");
		System.out.println(y);

		Function<Integer, Integer> doubleIt = (s) -> s * 2;
		Integer output = doubleIt.apply(8);
		System.out.println(output);

		Consumer<String> printIt = (s) -> System.out.println(s);
		printIt.accept("Gopesh");

		Supplier<String> randomString = () -> UUID.randomUUID().toString();
		String rand = randomString.get();
		System.out.println(rand);

	}
}
