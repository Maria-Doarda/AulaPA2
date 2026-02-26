package controllers;

import models.EstudanteModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.EstudanteService;

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
    public void deletarEstudante(Long id){
        estudanteService.deletar(id);
    }


}
