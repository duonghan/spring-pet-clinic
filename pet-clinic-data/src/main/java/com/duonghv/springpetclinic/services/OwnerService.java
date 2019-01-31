package com.duonghv.springpetclinic.services;

import com.duonghv.springpetclinic.model.Owner;

/**
 * Date created: 1/31/19
 * Author: Duong Han
 **/

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
