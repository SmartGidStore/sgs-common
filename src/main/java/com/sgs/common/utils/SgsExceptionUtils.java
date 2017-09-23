package com.sgs.common.utils;

import com.sgs.common.exceptions.*;
import com.sgs.common.model.base.model.BaseResponse;

public class SgsExceptionUtils {

    public static ResponseData responseData(Exception e) {
        if (e instanceof NotFoundException)
            return new ResponseData(new BaseResponse(e.getMessage()), 404);
        if (e instanceof WrongPassOrEmailException)
            return new ResponseData(new BaseResponse(e.getMessage()), 400);
        if (e instanceof EmptyRequestException)
            return new ResponseData(new BaseResponse(e.getMessage()), 400);
        if (e instanceof EmailNotValidException)
            return new ResponseData(new BaseResponse(e.getMessage()), 400);
        if (e instanceof PasswordDontMatchException)
            return new ResponseData(new BaseResponse(e.getMessage()), 400);
        return new ResponseData(new BaseResponse("Unexpected exception"), 500);
    }

    public static class ResponseData{
        private BaseResponse body;
        private Integer code;

        ResponseData(BaseResponse body, Integer code) {
            this.body = body;
            this.code = code;
        }

        public BaseResponse getBody() {
            return body;
        }

        public Integer getCode() {
            return code;
        }
    }

}
