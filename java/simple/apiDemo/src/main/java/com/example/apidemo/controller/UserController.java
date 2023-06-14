package com.example.apidemo.controller;

import com.example.apidemo.entity.UserEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    com.example.apidemo.mapper.UserMapper userMapper;
    @GetMapping
    public List<UserEntity> getUser() {
        return userMapper.findAll();
    }

    @PostMapping
    public String addUser(@RequestBody UserEntity user){
        //把前端传过来的数据转化为user实体类的对象插入到数据库中
        userMapper.save(user);
        return "success";


    }
    @PutMapping
    public String updateUser(@RequestBody UserEntity user){
        userMapper.updateById(user);
        return "success";
    }

    @DeleteMapping("/{id}")  //一一对相应的关系
    public String deleteUser(@PathVariable("id") Long id){
        //注解是循序json回传带有id
        userMapper.deleteById(id);
        return "success";
    }
    @GetMapping("/{id}")  //把返回的结果 返回出来 包装成一个user对象
    public UserEntity findById(@PathVariable("id") Long id){
        //注解是循序json回传带有id
        return userMapper.findById(id);
    }

}