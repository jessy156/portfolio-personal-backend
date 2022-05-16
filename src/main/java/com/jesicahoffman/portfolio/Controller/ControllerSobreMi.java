
package com.jesicahoffman.portfolio.Controller;

import com.jesicahoffman.portfolio.model.SobreMi;
import com.jesicahoffman.portfolio.service.ISobreMiService;
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
public class ControllerSobreMi {
    
      @Autowired
    private ISobreMiService sobremiServ;
    
    @PostMapping("/new/sobremi")
    public void agregarSobreMi(@RequestBody SobreMi sobremi){
        sobremiServ.crearSobreMi(sobremi);
    }
    
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping ("/ver/sobremi")
    @ResponseBody
    public List<SobreMi> verSobreMi(){
        return sobremiServ.verSobreMi();
    }
    
    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping("/delete/sobremi/{id}")
    public void borrarSobreMi(@PathVariable Long id){
        sobremiServ.borrarSobreMi(id);
    }
    
    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping("/modificar/sobremi")
    public void editarSobreMi(@RequestBody SobreMi sobremi){
        sobremiServ.editarSobreMi(sobremi);
    }
}
