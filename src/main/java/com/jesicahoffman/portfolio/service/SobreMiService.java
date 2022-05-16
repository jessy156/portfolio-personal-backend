
package com.jesicahoffman.portfolio.service;

import com.jesicahoffman.portfolio.model.SobreMi;
import com.jesicahoffman.portfolio.repository.SobreMiRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SobreMiService implements ISobreMiService{
    
    @Autowired
    public SobreMiRepository sobremiRepo;

    @Override
    public List<SobreMi> verSobreMi() {
       return sobremiRepo.findAll();
    }

    @Override
    public void crearSobreMi(SobreMi sobremi) {
        sobremiRepo.save(sobremi);
    }

    @Override
    public void borrarSobreMi(Long id) {
        sobremiRepo.deleteById(id);
    }

    @Override
    public SobreMi editarSobreMi(SobreMi sobremi){
       return sobremiRepo.save(sobremi);
    }
}
