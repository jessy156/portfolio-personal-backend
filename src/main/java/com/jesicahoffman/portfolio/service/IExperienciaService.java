
package com.jesicahoffman.portfolio.service;

import com.jesicahoffman.portfolio.model.Experiencia;
import java.util.List;

public interface IExperienciaService {
    
    public List<Experiencia> verExperiencias();
    public void crearExperiencia(Experiencia exp);
    public void borrarExperiencia(Long id);
    public Experiencia editarExperiencia(Experiencia exp);
}
