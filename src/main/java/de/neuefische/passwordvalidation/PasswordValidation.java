package de.neuefische.passwordvalidation;

public class PasswordValidation {

    private static final int MINIMUM_LENGTH = 8;

    private static boolean passwordLengthValidation(String password) {

        if (password.length() >= MINIMUM_LENGTH) {
            return true;
        }
        else {
            System.out.println("The password must have a minimum length of " + MINIMUM_LENGTH + " signs.");
        }

        return false;
    }


    private static boolean passwordHasDigitValidation(String password) {

        for (int i = 0; i < password.length(); i++) {

            if (Character.isDigit(password.charAt(i))) {
                return true;
            }
        }

        System.out.println("The password must contain at least one digit.");
        return false;
    }


    private static boolean passwordHasLowerCaseLetter(String password) {

        for (int i = 0; i < password.length(); i++) {

            if (Character.isLowerCase(password.charAt(i))) {
                return true;
            }
        }

        System.out.println("The password must have at least one lower case letter.");
        return false;
    }

    private static boolean passwordHasUpperCaseLetter(String password) {

        for (int i = 0; i < password.length(); i++) {

            if (Character.isUpperCase(password.charAt(i))) {
                return true;
            }
        }

        System.out.println("The password must have at least one upper case letter.");
        return false;
    }


    public static boolean checkPassword(String password)
    {
        boolean checkAll = true;

        if(!passwordLengthValidation(password)) {
            checkAll = false;
        }

        if(!passwordHasDigitValidation(password)) {
            checkAll = false;
        }

        if(!passwordHasLowerCaseLetter(password)) {
            checkAll = false;
        }

        if(!passwordHasUpperCaseLetter(password)) {
            checkAll = false;
        }

        if(checkAll) {
            System.out.println("The password is fine");
        }

        return checkAll;
    }


    public static boolean checkListOfPasswords(String[] passwords)
    {
        for(int i = 0; i < passwords.length; i++) {

            System.out.println("\nThe " + (i+1) + " password in the list: ");
            checkPassword(passwords[i]);
        }
        return false;
    }
}
