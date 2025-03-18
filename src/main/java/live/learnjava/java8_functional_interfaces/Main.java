package live.learnjava.java8_functional_interfaces;

public class Main {
	public static void main(String[] args) {
		Calculator calc = (a, b) -> a + b;
		int result = calc.add(5, 6);
		System.out.println(result);
	}
}
