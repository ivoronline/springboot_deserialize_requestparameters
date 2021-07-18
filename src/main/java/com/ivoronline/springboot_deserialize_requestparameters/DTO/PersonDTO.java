package com.ivoronline.springboot_deserialize_requestparameters.DTO;

public class PersonDTO {

  //PROPERTIES
  public String  firstName;
  public Integer age;

  //SETTERS (used for deserialization)
  public void setName(String  name) { this.firstName = name + " Setter"; }
  public void setAge (Integer age ) { this.age       = age;              }

}
