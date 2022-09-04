package com.example.study_sb.controller;

import com.example.study_sb.dto.MemberDTO;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/get-api")
public class GetController {
    //http://localhost:8080/api/v1/get-api/hello
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String getHello(){
        return "hello world";
    }
    //http://localhost:8080/api/v1/get-api/name
    @GetMapping("/name")
    public String getName(){
        return "hihi";
    }
    //http://localhost:8080/api/v1/get-api/variable1/{var}
    @GetMapping("/variable1/{var}")
    public String getVariable1(@PathVariable String var){
        return var;
    }
    //http://localhost:8080/api/v1/get-api/variable2/{var}
    @GetMapping("/variable2/{var}")
    public String getVariable2(@PathVariable("var") String x){
        return x;
    }
    //http://localhost:8080/api/v1/get-api/request1?name=hihi&email=1212@naver.com&orgar=cbnu
    @GetMapping("/request1")
    public String getRequestParam1(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String orgar){
        return name+" "+email+" "+orgar;
    }
    //http://localhost:8080/api/v1/get-api/request2?name=hihi&email=1212@naver.com&orgar=cbnu
    @GetMapping("/request2")
    public String getRequestParam2(
            @RequestParam Map<String,String> param){
        StringBuilder sb= new StringBuilder();

        param.entrySet().forEach(a->{
            sb.append(a.getKey()+" : "+a.getValue()+"\n");
        });
        return sb.toString();
    }
    //http://localhost:8080/api/v1/get-api/request3?name=hihi&email=1212@naver.com&orgar=cbnu
    @GetMapping("/request3")
    public String getRequestParam3(
            MemberDTO memberDTO){
        return memberDTO.toString();
    }
}
