import java.util.Scanner;

public class invalidAgeException {
	public static void main(String[] args) {
		System.out.println("Enter your age");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();

		try {
			checkAgeHandler(a);
		} catch (invalidAgeException e) {
			// System.out.println(e.getmessage());
			e.printStackTrace();
		}
	}

	static void checkAgeHandler(int a) throws invalidAgeException {
		checkAge(a);
	}

	static void checkAge(int a) throws invalidAgeException {
		if (a < 18) {
			throw new invalidAgeException("You are not eligible as you are not an adult");
		} else {
			System.out.println("Welcome");
		}
	}

	class invalidAgeException extends Exception {
	public invalidAgeException(String message) {

		public invalidAgeException(String message) {
			super(message);
		}
	}
}
