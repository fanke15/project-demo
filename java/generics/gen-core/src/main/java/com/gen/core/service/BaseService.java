package com.gen.core.service;

import java.util.List;

public interface BaseService<T> {

    List<T> list();

    T getById(int id);
}
