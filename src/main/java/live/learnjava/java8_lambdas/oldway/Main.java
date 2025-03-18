package live.learnjava.java8_lambdas.oldway;

public class Main {
	public static void main(String[] args) {
		Greeting greeting = new Greeting() {
			public void sayHello() {
				System.out.println("Hello! from Anonymous class");
			}
		};
		greeting.sayHello();
	}
}
