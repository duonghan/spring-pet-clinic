package com.duonghv.springpetclinic.services;

import com.duonghv.springpetclinic.model.Owner;

import java.util.Set;

/**
 * Date created: 1/31/19
 * Author: Duong Han
 **/

public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long Id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
