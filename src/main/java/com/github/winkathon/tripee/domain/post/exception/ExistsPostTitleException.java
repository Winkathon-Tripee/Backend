package com.github.winkathon.tripee.domain.post.exception;

import org.springframework.http.HttpStatus;

import com.github.winkathon.tripee.common.api.exception.ApiException;

public class ExistsPostTitleException extends ApiException {

    public ExistsPostTitleException() {

        super(HttpStatus.CONFLICT, "이미 존재하는 제목입니다.");
    }
}
