package com.duonghv.springpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Date created: 01/02/2019 - 15:07
 * Author: Duong Han
 */

@RequestMapping("/owners")
@Controller
public class OwnerController {

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listOwners() {

        return "owners/index";
    }
}
