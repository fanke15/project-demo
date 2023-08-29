package com.gen.core.service.impl;


import com.gen.core.mapper.BaseMapper;
import com.gen.core.service.BaseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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