package com.gen.core.service.impl;

import com.gen.beans.entity.example.DefaultExampleEntity;
import com.gen.common.constants.TableConstants;
import com.gen.core.mapper.ExampleMapper;
import com.gen.core.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ExampleServiceImpl extends BaseServiceImpl<DefaultExampleEntity> implements ExampleService {
    @Autowired
    private  ExampleMapper daoObj;


    @Override
    public ExampleMapper getDao() {
        return daoObj;
    }

    @Override
    public String getTableName() {
        return TableConstants.ExampleTableName;
    }

    @Override
    public DefaultExampleEntity getById(int id) {
        return exampleMapper.getById(getTableName(),id);
        // return getDao().getById(getTableName(),id);
    }
    @Override
    public DefaultExampleEntity getByUserId(String userId) {
        return exampleMapper.getByUserId(getTableName(),userId);
        // return getDao().getByUserId(userId);
    }
}