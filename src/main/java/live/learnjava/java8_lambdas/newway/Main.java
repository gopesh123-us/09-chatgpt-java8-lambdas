package live.learnjava.java8_lambdas.newway;

public class Main {
	public static void main(String[] args) {
		Greeting greeting = () -> System.out.println("Hello! New Way");
		greeting.sayHello();
	}
}
