package com.gen.core.mapper;

import com.gen.common.constants.TableConstants;
import com.gen.beans.entity.example.DefaultExampleEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ExampleMapper extends BaseMapper<DefaultExampleEntity>{
}
