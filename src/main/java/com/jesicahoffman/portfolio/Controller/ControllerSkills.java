
package com.jesicahoffman.portfolio.Controller;

import com.jesicahoffman.portfolio.model.Skills;
import com.jesicahoffman.portfolio.service.ISkillsService;
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
public class ControllerSkills {
    
    @Autowired
    private ISkillsService skillServ;
    @CrossOrigin
    @PostMapping("/new/skill")
    public void agregarSkill(@RequestBody Skills skill){
        skillServ.crearSkill(skill);
    }
    @CrossOrigin
    @GetMapping ("/ver/skills")
    @ResponseBody
    public List<Skills> verSkills(){
        return skillServ.verSkills();
    }
    @CrossOrigin
    @DeleteMapping("/delete/skill/{id}")
    public void borrarSkill(@PathVariable Long id){
        skillServ.borrarSkill(id);
    }
    @CrossOrigin
    @PutMapping("/modificar/skill")
    public void editarSkill(@RequestBody Skills skill){
        skillServ.editarSkill(skill);
    }
}
