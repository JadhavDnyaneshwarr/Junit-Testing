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
}