package com.example.study_sb.service;

import com.example.study_sb.dto.MemberDTO;
import org.springframework.http.ResponseEntity;

public interface RestTemplateService {

    public String getAroundHub();

    public String getName();

    public String getName2();

    public ResponseEntity<MemberDTO> postDto();

    public ResponseEntity<MemberDTO> addHeader();

}
