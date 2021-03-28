package com.homeservice.homeservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("homeService")
@CrossOrigin("*")
public class HomeController {


    @GetMapping(name = "/getHello")
    public String getHello(){
        return "Bro this got deployed";
    }

}
