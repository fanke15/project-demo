package com.gen.core.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BaseMapper<T> {
    @Select("select * from ${tableName} where id = #{id}")
    T getById(@Param("tableName") String tableName, @Param("id") int id);

    @Select("select * from ${tableName} where user_id = #{userID}")
    T getByUserId(@Param("tableName") String tableName, @Param("userID") String userID);

    @Select("select * from ${tableName}")
    List<T> list(@Param("tableName") String tableName);
}