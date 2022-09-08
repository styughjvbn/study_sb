package com.example.study_sb.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class hellocontroller {
    //@RequestMapping(value = "/hello", method = RequestMethod.GET) 고전적인 방법
    private final Logger LOGGER= LoggerFactory.getLogger(hellocontroller.class);


    @PostMapping("/exception")
    public void exceptionTest() throws Exception {
        throw new Exception();
    }
//    @ExceptionHandler(Exception.class)
//    public ResponseEntity<Map<String,String>> ExceptionHandler(Exception e){
//        HttpHeaders responseHaeders=new HttpHeaders();
//        HttpStatus httpStatus=HttpStatus.BAD_REQUEST;
//
//        LOGGER.info(e.getLocalizedMessage());
//        LOGGER.info("컨트롤러 내 예외핸들러 호출");
//
//        Map<String,String> map=new HashMap<>();
//        map.put("error type", httpStatus.getReasonPhrase());
//        map.put("code","400");
//        map.put("message","에러 발생");
//        return new ResponseEntity<>(map,responseHaeders,httpStatus);
//    }

    @PostMapping("log-test")
    public  void logTest(){
        LOGGER.trace("트레이스 로그");
        LOGGER.debug("디버그 로그");
        LOGGER.info("인포 로그");
        LOGGER.warn("경고 로그");
        LOGGER.error("에러 로그");
    }

}
