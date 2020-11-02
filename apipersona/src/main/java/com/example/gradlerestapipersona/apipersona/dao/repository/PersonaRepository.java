package com.example.gradlerestapipersona.apipersona.dao.repository;

import com.example.gradlerestapipersona.apipersona.dao.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Integer> {
    //Persona findByName(String name);
}
