package com.example.apidemo.mapper;

import com.example.apidemo.entity.UserEntity;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
public interface UserMapper {

    @Select("select * from user")
    List<UserEntity> findAll();

    @Update("INSERT INTO `user` (`name`, `address`, `age`, `sex`, `phone`) VALUES (#{name},#{address},#{age},#{sex},#{phone});")
    @Transactional
    void save(UserEntity user);


    @Update("update user set name=#{name} , address=#{address}, age=#{age}, sex=#{sex},phone=#{phone} where id =#{id}")
    @Transactional
    void updateById(UserEntity user);


    @Delete("delete from user where id =#{id}")
    @Transactional
    void deleteById(Long id);

    @Select("select * from user where id =#{id}")
    UserEntity findById(Long id);
}