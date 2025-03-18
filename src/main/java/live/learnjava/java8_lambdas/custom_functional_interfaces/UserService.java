package live.learnjava.java8_lambdas.custom_functional_interfaces;

@FunctionalInterface
public interface UserService<T> {
	void saveUser(T user);
}
