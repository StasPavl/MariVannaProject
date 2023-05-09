package com.mvproject.service;

import java.util.List;

public interface CRUDService<T,ID>{
    T save(T user);
    T findById(ID id);
    List<T> findAll();
    void deleteById(ID id);

    void update(T object);
}