
package com.jesicahoffman.portfolio.service;

import com.jesicahoffman.portfolio.model.Educacion;
import com.jesicahoffman.portfolio.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService{
    
    @Autowired
    public EducacionRepository educRepo;

    @Override
    public List<Educacion> verEducaciones() {
       return educRepo.findAll();
    }

    @Override
    public void crearEducacion (Educacion educ) {
        educRepo.save(educ);
    }

    @Override
    public void borrarEducacion(Long id) {
        educRepo.deleteById(id);
    }

    
    @Override
    public Educacion editarEducacion(Educacion educ){
       return educRepo.save(educ);
    }
}
