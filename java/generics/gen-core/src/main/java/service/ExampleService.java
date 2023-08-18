package service;


import entity.example.DefaultExampleEntity;

public interface ExampleService extends BaseService<DefaultExampleEntity>{
    DefaultExampleEntity getByUserId(int userId);
}
