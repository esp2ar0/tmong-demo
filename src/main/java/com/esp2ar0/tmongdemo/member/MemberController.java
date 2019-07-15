package com.esp2ar0.tmongdemo.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/members")
public class MemberController {

    @Autowired
    private MemberRepository memberRepository;

    @PostMapping
    public ResponseEntity create(@RequestBody Member member) {
        Member savedMember = memberRepository.save(member);
        return new ResponseEntity(savedMember, HttpStatus.CREATED);
    }
}
