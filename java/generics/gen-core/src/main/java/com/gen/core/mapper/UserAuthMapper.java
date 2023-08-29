package com.gen.core.mapper;

import com.gen.beans.entity.user.UserAuthEntity;
import com.gen.common.constants.TableConstants;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserAuthMapper extends BaseMapper<UserAuthEntity>{
    @Select("select * from "+ TableConstants.UserAuthTableName +" where auth_id = #{authID}")
    UserAuthEntity getByAuthId( @Param("authID") String authID);
}
