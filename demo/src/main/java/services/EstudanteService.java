package services;

import models.EstudanteModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.EstudanteRepository;

import java.util.List;

@Service
public class EstudanteService {

    @Autowired
    private EstudanteRepository estudanteRepository;

    public EstudanteModel criarEstudante(EstudanteModel estudanteModel){
        return estudanteModel;
    }
    public List<EstudanteModel> findAll(){
        return estudanteRepository.findAll();
    }

    public void deletar(Long id){
        estudanteRepository.deleteById(id);
    }

}
