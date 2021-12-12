package com.aktivgo.demo.dao;

import java.util.List;
import java.util.Optional;

public interface Dao<T> {
    long size();

    Optional<T> get(long id);

    List<T> getAll();

    void save(T t);

    void delete(T t);
}
