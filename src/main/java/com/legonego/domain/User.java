package com.legonego.domain;


import lombok.Data;

@Data
public class User {
    private Integer id;
    private String name;
    private String password;
    private String username;
    private String email;
    private String addr1;
    private String addr2;
    private String postcode;
    private String tel;
    private String birth;
    private String resdate;
    private String lev;
    private String act;
}