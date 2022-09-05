package com.example.study_sb.controller;

import com.example.study_sb.dto.MemberDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("api/v1/put-api")
public class PutController {
    @PutMapping("/default")
    public String putMethod(){
        return "put";
    }
    @PutMapping("/member")
    public String postMember(@RequestBody Map<String, Object> postdata){
        StringBuilder sb= new StringBuilder();

        postdata.entrySet().forEach(a->{
            sb.append(a.getKey()+" : "+a.getValue()+"\n");
        });
        return sb.toString();
    }
    @PutMapping("/member1")
    public String PostMemberDTO1(
            @RequestBody MemberDTO memberDTO){
        return memberDTO.toString();
    }
    @PutMapping("/member2")
    public MemberDTO PostMemberDTO2(
            @RequestBody MemberDTO memberDTO){
        return memberDTO;
    }
    @PutMapping("/member3")
    public ResponseEntity<MemberDTO> PostMemberDTO3(
            @RequestBody MemberDTO memberDTO){
        return ResponseEntity.status((HttpStatus.ACCEPTED)).body((memberDTO));
    }
}
