package com.example.study_sb.controller;

import com.example.study_sb.dto.MemberDTO;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/api/v1/post-api")
public class PostController {

    //http://localhost:8080/api/v1/post-api/default
    @PostMapping("/default")
    public String postMethod(){
        return "post";
    }


    //http://localhost:8080/api/v1/post-api/member1
    @PostMapping("/member1")
    public String postMember1(
            @RequestBody Map<String, Object> param){
        StringBuilder sb= new StringBuilder();

        param.entrySet().forEach(a->{
            sb.append(a.getKey()+" : "+a.getValue()+"\n");
        });
        return sb.toString();
    }
    //http://localhost:8080/api/v1/post-api/member2
    @PostMapping("/member2")
    public String PostMember2(
            @RequestBody MemberDTO memberDTO){
        return memberDTO.toString();
    }
}