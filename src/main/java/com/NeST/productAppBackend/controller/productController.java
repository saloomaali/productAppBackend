package com.NeST.productAppBackend.controller;

import com.NeST.productAppBackend.model.Products;
import org.springframework.web.bind.annotation.*;

@RestController
public class productController {

    @CrossOrigin(origins = "*")
    @PostMapping("/")
    public String productWelcome(){
        return "welcome to product website";
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add", consumes = "application/json", produces = "application/json")
    public String productAdd(@RequestBody Products p){

        System.out.println(p.getPrd_name());
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
    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public String productView(){
        return "welcome to product view page";
    }
    @PostMapping("/delete")
    public String productDelete(){
        return "welcome to product delete page";
    }
}
