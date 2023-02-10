package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserReg {
    Pattern pattern;
    Matcher matcher;
    public static final String validName = "^[A-Z][A-Za-z]{2,}$";
    public boolean validateFirstName(String firstName) {
        Pattern pattern = Pattern.compile(validName);
        Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();
    }

    public boolean validateLastName(String lastName) {
        Pattern pattern = Pattern.compile(validName);
        Matcher matcher = pattern.matcher(lastName);
        return matcher.matches();
    }

    public boolean validateEmail(String email) {
        String validEmail = "^[A-Za-z]{3,}[.]?([A-Za-z]*)+@([b][l][.][c][o])+([.][i]?[n]?)$";
        Pattern pattern = Pattern.compile(validEmail);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public boolean validateMobileNumber(String mobileNumber) {
        String validMobileNumber = "^[1-9]{2}[ ][1-9]{1}[0-9]{9}$";
        Pattern pattern = Pattern.compile(validMobileNumber);
        Matcher matcher = pattern.matcher(mobileNumber);
        return matcher.matches();
    }

    public boolean validatePassword(String password) {
        String validPassword = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$%&*+])[A-Za-z0-9!@#$%&*+]{8,}$";
        Pattern pattern = Pattern.compile(validPassword);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}