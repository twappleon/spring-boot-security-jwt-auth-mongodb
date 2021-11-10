package com.bezkoder.spring.jwt.mongodb.exceptiopn;

import com.bezkoder.spring.jwt.mongodb.enumration.StatusEnum;
import com.bezkoder.spring.jwt.mongodb.models.RespData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@ControllerAdvice
public class RestExceptionHnadler {
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public RespData processMatchException(Exception ex){
        log.warn("GlobalException {}", ex);
        return new RespData(StatusEnum.FAIL.getValue(),StatusEnum.FAIL.getInfo(),ex.toString());
    }

    @ExceptionHandler(value = NullPointerException.class)
    @ResponseBody
    public RespData processMatchException(NullPointerException ex){
        log.warn("processMatchException {}", ex);

        return new RespData(StatusEnum.FAIL.getValue(),StatusEnum.FAIL.getInfo(),ex.toString());
    }

    @ExceptionHandler(value = BusinessLogicException.class)
    @ResponseBody
    public RespData businessLogicException(BusinessLogicException ex){
        log.warn("businessLogicException {}", ex);
        return new RespData(ex.getValue(),ex.getInfo(),ex.fillInStackTrace());
    }

}


