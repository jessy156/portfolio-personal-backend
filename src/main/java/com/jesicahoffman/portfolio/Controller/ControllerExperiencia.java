
package com.jesicahoffman.portfolio.Controller;

import com.jesicahoffman.portfolio.model.Experiencia;
import com.jesicahoffman.portfolio.service.IExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerExperiencia {
    
    @Autowired
    private IExperienciaService expServ;
    
    @CrossOrigin
    @PostMapping("/new/experiencia")
    public void agregarExperiencia(@RequestBody Experiencia exp){
        expServ.crearExperiencia(exp);
    }
    @CrossOrigin
    @GetMapping ("/ver/Experiencias")
    @ResponseBody
    public List<Experiencia> verExperiencias(){
        return expServ.verExperiencias();
    }
    @CrossOrigin
    @DeleteMapping("/delete/Experiencia/{id}")
    public void borrarExperiencia(@PathVariable Long id){
        expServ.borrarExperiencia(id);
    }
    @CrossOrigin
    @PutMapping("/modificar/experiencia")
    public void editarExperiencia (@RequestBody Experiencia exp){
        expServ.editarExperiencia(exp);
    }
}
