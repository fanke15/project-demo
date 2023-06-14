package com.example.apidemo.entity;

import lombok.Data;

@Data
public class UserEntity {
    private Integer id;
    private String name;
    private String address;
    private Integer age;
    private String sex;
    private String phone;

}