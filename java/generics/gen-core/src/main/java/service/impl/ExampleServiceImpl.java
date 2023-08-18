package service.impl;

import constants.TableConstants;
import entity.example.DefaultExampleEntity;
import mapper.ExampleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import service.ExampleService;


@Service
@RequestMapping(TableConstants.ExampleTableName)
public class ExampleServiceImpl extends BaseServiceImpl<DefaultExampleEntity> implements ExampleService {
    private final ExampleMapper daoObj;

    @Autowired
    public ExampleServiceImpl(ExampleMapper dao) {
        this.daoObj = dao;
    }

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
        return getDao().getById(id);
    }
    @Override
    public DefaultExampleEntity getByUserId(int userId) {
        return getDao().getByUserId(userId);
    }
}