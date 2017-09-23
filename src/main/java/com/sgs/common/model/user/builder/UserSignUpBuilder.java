package com.sgs.common.model.user.builder;

import com.sgs.common.model.base.builder.BaseBuidler;
import com.sgs.common.model.user.dto.UserSignUpDto;

public class UserSignUpBuilder implements BaseBuidler<UserSignUpDto>{

    private String email;
    private String password;
    private String confirmPassword;
    private String name;
    private String surname;
    private String phoneNumber;

    public UserSignUpDto build() {
        UserSignUpDto dto = new UserSignUpDto();
        dto.setEmail(email);
        dto.setPassword(password);
        dto.setConfirmPassword(confirmPassword);
        dto.setName(name);
        dto.setSurname(surname);
        dto.setPhoneNumber(phoneNumber);
        return dto;
    }

    public UserSignUpBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public UserSignUpBuilder setPassword(String password) {
        this.password = password;
        return this;
    }

    public UserSignUpBuilder setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
        return this;
    }

    public UserSignUpBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public UserSignUpBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public UserSignUpBuilder setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

}
