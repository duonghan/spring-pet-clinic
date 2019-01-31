package com.duonghv.springpetclinic.model;

import java.time.LocalDate;

/**
 * Date created: 1/31/19
 * Author: Duong Han
 **/

public class Pet {
    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;


    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
