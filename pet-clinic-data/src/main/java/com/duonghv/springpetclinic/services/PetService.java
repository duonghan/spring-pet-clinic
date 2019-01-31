package com.duonghv.springpetclinic.services;

import com.duonghv.springpetclinic.model.Pet;

import java.util.Set;

/**
 * Date created: 1/31/19
 * Author: Duong Han
 **/

public interface PetService {

    Pet findById(Long Id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
