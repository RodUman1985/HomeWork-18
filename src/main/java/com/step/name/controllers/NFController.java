package com.step.name.controllers;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/404")
public class NFController {
@PostMapping()
  public String  getNFPage(){
      return "404";
  };
}
