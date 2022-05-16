
package com.jesicahoffman.portfolio.service;

import com.jesicahoffman.portfolio.model.Skills;
import java.util.List;

public interface ISkillsService {
    
     public List<Skills> verSkills();
    public void crearSkill(Skills exp);
    public void borrarSkill(Long id);
    public Skills editarSkill(Skills exp);
}
