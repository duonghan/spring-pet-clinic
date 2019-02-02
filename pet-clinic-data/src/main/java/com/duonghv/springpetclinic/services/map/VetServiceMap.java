package com.duonghv.springpetclinic.services.map;

import com.duonghv.springpetclinic.model.Vet;
import com.duonghv.springpetclinic.services.VetService;

import java.util.Set;

/**
 * Date created: 31/01/2019 - 22:03
 * Author: Duong Han
 */

public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
