package com.ivoronline.springboot_deserialize_requestparameters.DTO;

public class PersonDTO {

  //PROPERTIES
  public String  name;
  public Integer age;

  //SETTERS (Setter Names are HTTP Request Parameters)
  public void setFirstName(String  reqName) { this.name = this.name + reqName + " Setter"; }
  public void setAge      (Integer reqAge ) { this.age  = reqAge;                          }

  //CONSTRUCTOR
  public PersonDTO(String firstName, Integer age) {
    this.name = firstName + " Constructor ";
    this.age  = age;
  }

}
