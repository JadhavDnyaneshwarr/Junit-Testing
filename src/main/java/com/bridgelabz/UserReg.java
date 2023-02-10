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
}