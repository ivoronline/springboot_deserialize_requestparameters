package com.ivoronline.springboot_deserialize_requestparameters.controllers;

import com.ivoronline.springboot_deserialize_requestparameters.DTO.PersonDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  //================================================================
  // HELLO
  //================================================================
  @RequestMapping("Hello")
  String hello(PersonDTO personDTO) {
    return "Hello " + personDTO.name;
  }

}
