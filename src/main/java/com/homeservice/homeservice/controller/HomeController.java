package com.homeservice.homeservice.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {


    @RequestMapping(name = "/", method = RequestMethod.GET, produces = "application/json")
    public String getHome(){
        return "WELCOME TO HOME PAGE";
    }

    @GetMapping(name = "/getHello")
    public String getHello(){
        return "Bro this got deployed";
    }

}
