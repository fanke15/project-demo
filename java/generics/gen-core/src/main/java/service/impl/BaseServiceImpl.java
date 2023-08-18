package service.impl;


import mapper.BaseMapper;
import mapper.ExampleMapper;
import service.BaseService;

import java.util.List;

public abstract class BaseServiceImpl<T> implements BaseService<T> {

    public abstract BaseMapper<T> getDao();
    public abstract String getTableName();


    @Override
    public List<T> list() {
        return getDao().list(getTableName());
    }
    @Override
    public T getById(int id) {
        return getDao().getById(getTableName(),id);
    }
}