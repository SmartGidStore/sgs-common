package com.sgs.common.model.user.builder;

import com.sgs.common.model.user.dto.UserSignUpDto;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserSignUpBuilderTest {

    private String email;
    private String password;
    private String confirmPassword;
    private String name;
    private String surname;
    private String phoneNumber;

    @BeforeEach
    void setup() {
        email = "test@gmail.com";
        password = "Qwe123";
        confirmPassword = "Qwe123";
        name = "UserSignUp";
        surname = "TestBuilder";
        phoneNumber = "+380665554321";
    }

    @Test
    void userSignUpBuilderTest(){
        UserSignUpDto dto = new UserSignUpBuilder()
                .setEmail(email)
                .setPassword(password)
                .setConfirmPassword(confirmPassword)
                .setName(name)
                .setSurname(surname)
                .setPhoneNumber(phoneNumber)
                .build();

        assertEquals(dto.getEmail(), email);
        assertEquals(dto.getPassword(), password);
        assertEquals(dto.getConfirmPassword(), confirmPassword);
        assertEquals(dto.getName(), name);
        assertEquals(dto.getSurname(), surname);
        assertEquals(dto.getPhoneNumber(), phoneNumber);
    }


}
