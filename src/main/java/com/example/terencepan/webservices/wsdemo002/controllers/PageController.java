package com.example.terencepan.webservices.wsdemo002.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {


    @RequestMapping("/")
    public String index(Model model){

    return "index";}

    @RequestMapping("/admin")
    public String admin(Model model) {

    return "admin";
    }
}
