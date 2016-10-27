package com.goit.popov.ee09.dao.entity;

import com.goit.popov.ee09.model.Employee;

import java.util.List;

/**
 * Generic interface for CRUD operations
 * @Author: Andrey P.
 * @version 1.0
 */
public interface GenericDAO<T> {
        int insert(T t);
        void update(T t);
        List<T> getAll();
        T getById(int id);
        void delete(T t);
}
