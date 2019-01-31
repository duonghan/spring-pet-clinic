package com.duonghv.springpetclinic.services;

import java.util.Set;

/**
 * Date created: 31/01/2019 - 21:48
 * Author: Duong Han
 */

public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
