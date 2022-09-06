package com.example.study_sb.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
public class hellocontroller {
    //@RequestMapping(value = "/hello", method = RequestMethod.GET) 고전적인 방법
    private final Logger LOGGER= LoggerFactory.getLogger(hellocontroller.class);



    @PostMapping("log-test")
    public  void logTest(){
        LOGGER.trace("트레이스 로그");
        LOGGER.debug("디버그 로그");
        LOGGER.info("인포 로그");
        LOGGER.warn("경고 로그");
        LOGGER.error("에러 로그");
    }

}
