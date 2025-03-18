package live.learnjava.java8_lambdas.custom_functional_interfaces;

public class Main {
	public static void main(String[] args) {
		UserService<User> userService = (u) -> System.out.println("Saving... "+u.toString());
		User user = new User(1L, "Gopi", "gopesh.sharma@gmail.com");
		userService.saveUser(user);
	}
}
