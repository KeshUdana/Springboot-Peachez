package com.example.project1.controller;

@RestContoller
public class Controller{


    @PostMapping
    public String createProduct(){
        return "Product Created";
    }
    @GetMapping
    public String getProduct(){
        return "Got Product";
    }
    @PutMapping
    public String updateProduct(){
        return "Prodcut Updated";
    }

    @DeleteMapping
    public String deleteProduct(){
        return "Deleted Product";
    }

}