package mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface BaseMapper<T> {
    @Select("select * from ${tableName} where id = #{id}")
    T getById(@Param("tableName") String tableName, @Param("id") int id);

    @Select("select * from ${tableName}")
    List<T> list(@Param("tableName") String tableName);
}