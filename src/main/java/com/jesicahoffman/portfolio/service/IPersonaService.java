
package com.jesicahoffman.portfolio.service;

import com.jesicahoffman.portfolio.model.Persona;
import java.util.List;

public interface IPersonaService {
    
    public List<Persona> verPersonas();
    public void crearPersona(Persona per);
    public void borrarPersona(Long id);
    public Persona buscarPersona(Long id);
    public Persona editarPersona(Persona per);
}
