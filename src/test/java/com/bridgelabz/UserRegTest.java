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
}
