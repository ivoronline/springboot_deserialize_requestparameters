package com.ivoronline.springboot_deserialize_requestparameters.DTO;

public class PersonDTO {

  //PROPERTIES
  public String  name;
  public Integer age;

  //SETTERS (used for deserialization)
  public void setName(String  name) { this.name = name; }
  public void setAge (Integer age ) { this.age = age;   }

}
