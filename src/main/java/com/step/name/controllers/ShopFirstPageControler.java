package com.step.name.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ShopFirstPage")
public class ShopFirstPageControler {

    @GetMapping()
    public String getStartPage(){
        return "ShopFirstPage";
    }
}
