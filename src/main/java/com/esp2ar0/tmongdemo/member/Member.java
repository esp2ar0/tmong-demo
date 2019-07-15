package com.esp2ar0.tmongdemo.member;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Member {

    private Long id;
    private String memberId;
    private String password;
}
