package com.duonghv.springpetclinic.services;

import com.duonghv.springpetclinic.model.Vet;

import java.util.Set;

/**
 * Date created: 1/31/19
 * Author: Duong Han
 **/

public interface VetService {

    Vet findById(Long Id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
