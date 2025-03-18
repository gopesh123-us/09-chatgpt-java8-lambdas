package live.learnjava.java8_lambdas.method_reference;

import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
	public static void main(String[] args) {
		Function<Integer, Integer> squareFun = MathUtil::square;
		Integer output = squareFun.apply(10);
		System.out.println(output);

		Function<Integer, Integer> sqFunc = (x) -> x * x;
		Integer output2 = sqFunc.apply(90);
		System.out.println(output2);

		Printer printer = new Printer();
		Consumer<String> printerRef = printer::printMessage;
		String message = "Hello Method Ref";
		printerRef.accept("Hello Method Reference");
		printer.printMessage(message);

		Runnable r = () -> System.out.println("running");
		r.run();

		Thread thread = new Thread(()->{System.out.println("Started");});
		thread.start();
	}

}
