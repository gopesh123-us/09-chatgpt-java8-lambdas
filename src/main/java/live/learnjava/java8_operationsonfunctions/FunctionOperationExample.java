package live.learnjava.java8_operationsonfunctions;

import java.util.function.Function;
//this is an example of functional composition
public class FunctionOperationExample {
	public static void main(String[] args) {
		//Function as noun: square a function
		Function<Integer, Integer> square = x -> x * x;

		//Function as noun: double a number
		Function<Integer, Integer> doubleIt = x -> x * 2;

		//apply operation ON function.
		Function<Integer, Integer> squareThenDouble = square.andThen(doubleIt);
		System.out.println(squareThenDouble.apply(6));
	}
}
