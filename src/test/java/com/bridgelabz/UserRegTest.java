package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegTest {
    static UserReg userReg = new UserReg();

    @Test
    public void whenGivenValidFirstNameShouldReturnTrue(){
        boolean validName = userReg.validateFirstName("Dnyaneshwar");
        Assertions.assertEquals(true, validName);
    }
    @Test
    public void whenGivenValidLastNameShouldReturnTrue(){
        boolean validName = userReg.validateLastName("Jadhav");
        Assertions.assertEquals(true, validName);
    }
    @Test
    public void whenGivenValidEmailShouldReturnTrue(){
        boolean validEmail = userReg.validateEmail("Jadhav.dnyanesh@bl.co.in");
        Assertions.assertEquals(true, validEmail);
    }
    @Test
    public void whenGivenValidMobileNumberShouldReturnTrue(){
        boolean validMobileNumber = userReg.validateMobileNumber("91 8806474798");
        Assertions.assertEquals(true, validMobileNumber);
    }
}
