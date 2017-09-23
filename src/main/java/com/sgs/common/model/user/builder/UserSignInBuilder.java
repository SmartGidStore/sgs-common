package com.sgs.common.model.user.builder;

import com.sgs.common.model.base.builder.BaseBuidler;
import com.sgs.common.model.user.dto.UserSignInDto;
import com.sgs.common.model.user.dto.UserSignUpDto;

public class UserSignInBuilder implements BaseBuidler<UserSignInDto>{

    private String email;
    private String password;

    public UserSignInDto build(){
        UserSignInDto dto = new UserSignInDto();
        dto.setEmail(email);
        dto.setPassword(password);
        return dto;
    }

    public UserSignInBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public UserSignInBuilder setPassword(String password) {
        this.password = password;
        return this;
    }
}
