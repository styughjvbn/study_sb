package com.example.study_sb.common.exception;

import com.example.study_sb.common.Constants;
import org.springframework.http.HttpStatus;

public class TempException extends Exception{
    private static final long serialVersionUID=34;

    private Constants.ExceptionClass exceptionClass;
    private HttpStatus httpStatus;

    public TempException(Constants.ExceptionClass exceptionClass,HttpStatus httpStatus,String message){
        super(exceptionClass.toString()+message);
        this.exceptionClass=exceptionClass;
        this.httpStatus=httpStatus;
    }
    public Constants.ExceptionClass getExceptionClass(){
        return exceptionClass;
    }

    public int getHttpStatusCode(){
        return httpStatus.value();
    }
    public String getHttpStatusType(){
        return httpStatus.getReasonPhrase();
    }
    public HttpStatus getHttpStatus(){
        return httpStatus;
    }
}
