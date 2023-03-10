package com.Calculator.democalculator.Validator;


public class Validator {

    public static boolean isPhoneNumberValid(String phoneNumber) {
        //Check if the phone number starts with "0". If it doesn't, then the method immediately returns false,
        // indicating that the phone number is not valid.
        if (!phoneNumber.startsWith("0")) {
            return false;
        }
        //Check if the length of the phone number is between 6 and 10 digits (inclusive).
        // If the length is less than 6 or greater than 10,
        // then the method returns false.
        if (phoneNumber.length() < 6 || phoneNumber.length() > 10) {
            return false;
        }
        //If the phone number starts with "0" and has a length between 6 and 10 digits,
        // then the method checks if the phone number consists of only digits (0-9) using the regular expression "[0-9]+".
        // If the phone number matches this regular expression, then it is considered valid and the method returns true.
        // Otherwise, the method returns false.
        return phoneNumber.matches("[0-9]+");
    }

    public static boolean isEmailValid(String email) {
        int indexOfTopLevelDomainStart = email.lastIndexOf(".");
        int indexOfAtSign = email.lastIndexOf("@");

        if (indexOfAtSign == -1 || indexOfTopLevelDomainStart == -1) {
            return false;
        }
        String topLevelDomain = email.substring(indexOfTopLevelDomainStart + 1); // se
        String domainName = email.substring(indexOfAtSign + 1, indexOfTopLevelDomainStart);
        String name = email.substring(0, indexOfAtSign);
        String[] requiredStringParts = {name, domainName, topLevelDomain};

        for (String part : requiredStringParts) {
            if (part.length() == 0) {
                return false;
            }
        }
        return true;
    }

}