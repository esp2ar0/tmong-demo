package com.esp2ar0.tmongdemo.member;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MemberTest {

    @Test
    public void builder() {
        Member member = Member.builder()
                .memberId("nowmoon")
                .password("pass")
                .build();

        assertThat(member).isNotNull();
    }

    @Test
    public void javaBean() {
        //given
        Member member = new Member();
        String memberId = "nowmoon";
        String password = "pass";

        //when
        member.setMemberId(memberId);
        member.setPassword(password);

        //then
        assertThat(member.getMemberId()).isEqualTo(memberId);
        assertThat(member.getPassword()).isEqualTo(password);
    }

}