package com.duonghv.springpetclinic.model;

/**
 * Date created: 1/31/19
 * Author: Duong Han
 **/

public class PetType extends BaseEntity {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
