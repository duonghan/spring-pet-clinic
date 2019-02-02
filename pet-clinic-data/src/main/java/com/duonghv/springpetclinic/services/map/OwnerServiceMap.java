package com.duonghv.springpetclinic.services.map;

import com.duonghv.springpetclinic.model.Owner;
import com.duonghv.springpetclinic.services.OwnerService;

import java.util.Set;

/**
 * Date created: 31/01/2019 - 22:03
 * Author: Duong Han
 */

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
