package com.student.system.exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class Advice {

@ExceptionHandler(NotExistException.class)
    public @ResponseBody ErrorResponse notExist(NotExistException notExistException){

    return new ErrorResponse<>(404,"There is not a student like that");
}
}
