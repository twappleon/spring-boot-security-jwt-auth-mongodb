package com.bezkoder.spring.jwt.mongodb.exceptiopn;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class BusinessLogicException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	private HttpStatus httpStatus;
	private String statusCode;
	private Integer value;
    private String info;

    public BusinessLogicException() {
        super();
    }
    
    public BusinessLogicException(String statusCode, String message, HttpStatus httpStatus) {

        super(message);
        this.statusCode = statusCode;
        this.httpStatus = httpStatus;
    }

    public BusinessLogicException(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }


    public BusinessLogicException(String message, Throwable cause) {
        super(message, cause);
    }

    public BusinessLogicException(String message) {
        super(message);
    }

    public BusinessLogicException(Throwable cause) {
        super(cause);
    }

    public BusinessLogicException(Integer value, String info, HttpStatus httpStatus) {
        this.value = value;
        this.info = info;
        this.httpStatus = httpStatus;
    }
}
