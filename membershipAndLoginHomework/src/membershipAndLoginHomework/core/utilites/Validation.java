package membershipAndLoginHomework.core.utilites;

import java.util.regex.Pattern;

public class Validation {
	public static boolean isValidEmail(String email) {

		String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
		return Pattern.compile(regex).matcher(email).matches();
		
	}
}