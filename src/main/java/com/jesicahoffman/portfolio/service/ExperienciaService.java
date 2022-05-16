
package com.jesicahoffman.portfolio.service;

import com.jesicahoffman.portfolio.model.Experiencia;
import com.jesicahoffman.portfolio.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService{
    
    @Autowired
    public ExperienciaRepository expRepo;

    @Override
    public List<Experiencia> verExperiencias() {
       return expRepo.findAll();
    }

    @Override
    public void crearExperiencia(Experiencia exp) {
        expRepo.save(exp);
    }

    @Override
    public void borrarExperiencia(Long id) {
        expRepo.deleteById(id);
    }
    
    @Override
    public Experiencia editarExperiencia(Experiencia exp){
       return expRepo.save(exp);
    }
}
