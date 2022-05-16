
package com.jesicahoffman.portfolio.service;

import com.jesicahoffman.portfolio.model.Educacion;
import java.util.List;

public interface IEducacionService {
    
     public List<Educacion> verEducaciones();
    public void crearEducacion(Educacion educ);
    public void borrarEducacion(Long id);
    public Educacion editarEducacion(Educacion educ);
}
