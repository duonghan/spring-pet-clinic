package com.duonghv.springpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Date created: 01/02/2019 - 09:56
 * Author: Duong Han
 */

@Controller
public class IndexController {

    @RequestMapping({"", "/", "index", "index.html"})
    public String index() {

        return "index";
    }
}
