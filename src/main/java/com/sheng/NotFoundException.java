package com.sheng;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundException extends RuntimeException {

    public NotFoundException() {
        super();
        // TODO 自動產生的建構子 Stub
    }

    public NotFoundException(String message, Throwable cause) {
        super(message, cause);
        // TODO 自動產生的建構子 Stub
    }

    public NotFoundException(String message) {
        super(message);
        // TODO 自動產生的建構子 Stub
    }

}
