package com.duonghv.springpetclinic.model;

import java.io.Serializable;

/**
 * Date created: 1/31/19
 * Author: Duong Han
 **/

public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
