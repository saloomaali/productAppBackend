package com.NeST.productAppBackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
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
    @PostMapping("/search")
    public String productSearch(){
        return "welcome to product search page";
    }
    @PostMapping("/edit")
    public String productEdit(){
        return "welcome to product edit page";
    }
    @GetMapping("/view")
    public String productView(){
        return "welcome to product view page";
    }
    @PostMapping("/delete")
    public String productDelete(){
        return "welcome to product delete page";
    }
}
