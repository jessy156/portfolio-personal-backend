
package com.jesicahoffman.portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Skills {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String tecnologia;
    private String porcentaje;
    
    public Skills() {
    }

    public Skills(Long id, String tecnologia, String porcentaje) {
        this.id = id;
        this.tecnologia = tecnologia;
        this.porcentaje = porcentaje;
    }
    
    

}
