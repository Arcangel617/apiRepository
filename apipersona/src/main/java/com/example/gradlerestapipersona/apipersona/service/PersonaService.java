package com.example.gradlerestapipersona.apipersona.service;

import com.example.gradlerestapipersona.apipersona.dao.entity.Persona;
import com.example.gradlerestapipersona.apipersona.dao.repository.PersonaRepository;
import com.example.gradlerestapipersona.apipersona.dto.PersonaRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonaService {

    private final PersonaRepository personaRepository;

    public PersonaService(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }


    @Transactional
    public Persona createPersona(PersonaRequest personaRequest) {
        final Persona persona = new Persona();

        personaRequest.setId(personaRequest.getId());
        persona.setName(personaRequest.getName());
        persona.setLastName(personaRequest.getLastname());
        persona.setAge(personaRequest.getAge());
        persona.setDni(personaRequest.getDni());
        persona.setGenre(personaRequest.getGenre());
        persona.setBirthdate(personaRequest.getBirthdate());
        persona.setDni(personaRequest.getDni());
        return this.personaRepository.save(persona);

    }

    @Transactional
    public List<Persona> getAllPersonas {
        return  personaRepository.findAll();}


 /* ver

    @Transactional(readOnly = true)
    public Optional<Persona> getPersona(final int id) {
        return this.personaRepository.findById(id);
    }
    } */
}
