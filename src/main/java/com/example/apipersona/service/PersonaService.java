package com.example.apipersona.service;

import com.example.apipersona.dao.entity.Persona;
import com.example.apipersona.dao.repository.PersonaRepository;
import com.example.apipersona.dto.PersonaRequest;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Transactional(readOnly = true)
    public List<Persona> findAll() {
        return personaRepository.findAll();
    }

 /* ver

    @Transactional(readOnly = true)
    public Optional<Persona> getPersona(final int id) {
        return this.personaRepository.findById(id);
    }
    } */
}
