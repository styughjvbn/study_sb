package com.example.study_sb.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class TempExceptionHandler {
    private final Logger LOGGER = LoggerFactory.getLogger(TempExceptionHandler.class);

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Map<String,String>> ExceptionHandler(Exception e){
        HttpHeaders responseHaeders=new HttpHeaders();
        HttpStatus httpStatus=HttpStatus.BAD_REQUEST;

        LOGGER.info(e.getLocalizedMessage());
        LOGGER.info("어드바이스 내 예외핸들러 호출");

        Map<String,String> map=new HashMap<>();
        map.put("error type", httpStatus.getReasonPhrase());
        map.put("code","400");
        map.put("message","에러 발생");
        return new ResponseEntity<>(map,responseHaeders,httpStatus);
    }
}
