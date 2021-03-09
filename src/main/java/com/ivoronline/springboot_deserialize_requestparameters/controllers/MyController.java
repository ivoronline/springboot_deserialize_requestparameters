package com.ivoronline.springboot_deserialize_requestparameters.controllers;

import com.ivoronline.springboot_deserialize_requestparameters.DTO.PersonDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

  @ResponseBody
  @RequestMapping("/Hello")
  public String hello(PersonDTO personDTO) {
    return "Hello " + personDTO.name;
  }

}
