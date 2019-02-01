package com.duonghv.springpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Date created: 01/02/2019 - 15:07
 * Author: Duong Han
 */

@Controller
public class VetController {

    @RequestMapping({"/vets", "/vets/index", "/vets/index.html"})
    public String listVets() {

        return "vets/index";
    }
}
