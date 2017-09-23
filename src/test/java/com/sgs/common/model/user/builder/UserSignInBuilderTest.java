package com.sgs.common.model.user.builder;

import com.sgs.common.model.user.dto.UserSignInDto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserSignInBuilderTest {

    private String email;
    private String password;

    @BeforeEach
    void setup(){
        email = "test@gmail.com";
        password = "Qwe123";
    }

    @Test
    void buildTest() {
        UserSignInDto dto = new UserSignInBuilder()
                .setEmail(email)
                .setPassword(password)
                .build();

        assertEquals(dto.getEmail(), email);
        assertEquals(dto.getPassword(), password);
    }
}
