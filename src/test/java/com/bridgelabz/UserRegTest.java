package com.bridgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


public class UserRegTest {
    UserReg userReg;

    @Before
    public void setup(){
        userReg = new UserReg();
    }

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
    @Test
    public void whenGivenValidPasswordShouldReturnTrue(){
        boolean validPassword = userReg.validatePassword("Dj@12345");
        Assertions.assertEquals(true, validPassword);
    }
}
