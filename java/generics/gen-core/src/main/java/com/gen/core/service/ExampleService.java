package com.gen.core.service;


import com.gen.beans.entity.example.DefaultExampleEntity;

public interface ExampleService extends BaseService<DefaultExampleEntity>{
    DefaultExampleEntity getByUserId(String userId);
}
