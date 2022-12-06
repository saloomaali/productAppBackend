package com.NeST.productAppBackend.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class productController {

    @PostMapping("/")
    public String productWelcome(){
        return "welcome to product website";
    }
    @PostMapping("/add")
    public String productAdd(){
        return "welcome to product add page";
    }
}
