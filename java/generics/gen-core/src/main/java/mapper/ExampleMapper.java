package mapper;

import constants.TableConstants;
import entity.example.DefaultExampleEntity;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(TableConstants.ExampleTableName)
public interface ExampleMapper extends BaseMapper<DefaultExampleEntity>{
    @Select("select * from "+ TableConstants.ExampleTableName +" where id = #{id}")
    DefaultExampleEntity getById(@Param("id") int id);

    @Select("select * from "+ TableConstants.ExampleTableName +" where user_id = #{userId}")
    DefaultExampleEntity getByUserId( @Param("userId") int userId);
}
