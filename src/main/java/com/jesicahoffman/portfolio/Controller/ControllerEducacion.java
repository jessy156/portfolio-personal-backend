
package com.jesicahoffman.portfolio.Controller;

import com.jesicahoffman.portfolio.model.Educacion;
import com.jesicahoffman.portfolio.service.IEducacionService;
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
public class ControllerEducacion {
    
    @Autowired
    private IEducacionService educServ;
    
    @CrossOrigin
    @PostMapping("/new/educacion")
    public void agregarEducacion(@RequestBody Educacion educ){
        educServ.crearEducacion(educ);
    }
    @CrossOrigin
    @GetMapping ("/ver/educacion")
    @ResponseBody
    public List<Educacion> verEducaciones(){
        return educServ.verEducaciones();
    }
    @CrossOrigin
    @DeleteMapping("/delete/educacion/{id}")
    public void borrarEducacion(@PathVariable Long id){
        educServ.borrarEducacion(id);
    }
    @CrossOrigin
    @PutMapping("/modificar/educacion")
    public void editarEducacion(@RequestBody Educacion educ){
        educServ.editarEducacion(educ);
    }
}
