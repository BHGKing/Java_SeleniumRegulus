package JoseTask.Week06;

import java.util.Scanner;

public class String_PasswordValidation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a password: ");
        String password = input.next();

        System.out.println("Is your password valid? : " + verifyPassword(password) );
    }


    public static boolean verifyPassword(String password){

        boolean hasLowerCaseChar = password.matches("(.*[a-z].*)"),
                hasUpperCaseChar = password.matches("(.*[A-Z].*)"),
                hasDigits = password.matches("(.*[0-9].*)"),
                hasSpecialChar = password.matches("(.*[ -/, :-@].*)");

        if (password.length() >= 6 && !password.contains(" ") && password == null){
            if (hasLowerCaseChar && hasUpperCaseChar && hasDigits && hasSpecialChar){
                return true;
            }
        }

        return false;

    }
}
/*
1. Write a return method that can verify if a password is valid or not.
-Requirements:
1. Password MUST be at least have 6 characters and should not contain space
2. Password should at least contain one upper-case letter
3. Password should at least contain one lowercase letter
4. Password should at least contain one special character
5. Password should at least contain one digit
-if all requirements above are met, the method returns true, otherwise returns  false
 */