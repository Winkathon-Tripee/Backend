package com.github.winkathon.tripee.domain.auth.exception;

import org.springframework.http.HttpStatus;

import com.github.winkathon.tripee.common.api.exception.ApiException;

public class ExistsUserIdException extends ApiException {

    public ExistsUserIdException() {

        super(HttpStatus.CONFLICT, "이미 존재하는 아이디입니다.");
    }
}
