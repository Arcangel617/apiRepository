package com.example.apipersona.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PersonaRequest {

  private Integer id;
  private String name;
  private String lastname;
  private Integer age;
  private Integer dni;
  private String birthdate;
  private String genre;
}
