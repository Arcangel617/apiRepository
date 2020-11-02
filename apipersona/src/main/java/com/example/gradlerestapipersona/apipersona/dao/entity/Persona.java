package com.example.gradlerestapipersona.apipersona.dao.entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Data
@EqualsAndHashCode
@Entity
@Getter
@Setter
public class Persona implements Serializable {

    private static final long serialVersionUID = -7027197023480292255L;

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "lastName", nullable = false)
    private String lastName;

    /*  age can't be less than 0 and age can´t be higher than 100  */
    @Column(name = "age")
    private int age;

    @Column(name = "dni")
    private int dni;

    @Column(name = "birthdate")
    private String birthdate;

    @Column(name = "genre")
    private String genre;

}