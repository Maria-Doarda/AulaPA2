package com.example.nsei.controllers;

import com.example.nsei.models.EstudanteModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.nsei.services.EstudanteService;

import java.util.List;

@RestController
@RequestMapping(path = "/estudantes")
public class EstudanteController {

    @Autowired
    private EstudanteService estudanteService;

    @PostMapping
    public EstudanteModel criarEstudante(@RequestBody EstudanteModel estudanteModel){
        return estudanteService.criarEstudante(estudanteModel);
    }

    @GetMapping
    public List<EstudanteModel> buscarEstudantes(){
        return estudanteService.findAll();
    }

    @DeleteMapping("/{id}")
    public void deletarEstudante(@PathVariable Long id){
        estudanteService.deletar(id);
    }


}
