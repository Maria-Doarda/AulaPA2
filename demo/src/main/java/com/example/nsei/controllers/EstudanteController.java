package com.example.nsei.controllers;

import com.example.nsei.models.EstudanteModel;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.nsei.services.EstudanteService;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(path = "/estudantes")
public class EstudanteController {

    @Autowired
    private EstudanteService estudanteService;

    @PostMapping
    public ResponseEntity<EstudanteModel> criarEstudante(@RequestBody EstudanteModel estudanteModel) {
        EstudanteModel request = estudanteService.criarEstudante(estudanteModel);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").
                buildAndExpand(estudanteModel.getId()).toUri();

        return ResponseEntity.ok().body(request);

    }


    @GetMapping
        public ResponseEntity<List<EstudanteModel>> buscarEstudantes () {
            List<EstudanteModel> request = estudanteService.findAll();
            return ResponseEntity.ok().body(request);
        }

        @DeleteMapping
        public ResponseEntity <?> deletar(@PathVariable Long id){
           estudanteService.deletar(id);
           return ResponseEntity.noContent().build();
        }


}

