package com.example.apipersona.controller;

import com.example.apipersona.dao.entity.Persona;
import com.example.apipersona.dto.PersonaRequest;
import com.example.apipersona.service.PersonaService;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {

    private final PersonaService personaService;

    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @PostMapping(value = "/personas")
    public ResponseEntity<Persona> create(
            @RequestBody PersonaRequest personaRequest
    ) {
        return ResponseEntity.ok(personaService.createPersona(personaRequest) );
    }

    @GetMapping(value = "/personas")
    public ResponseEntity<List<Persona>> getAll() {
        return ResponseEntity.ok(personaService.findAll());
    }
}
