
package com.jesicahoffman.portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class SobreMi {
    
     @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String texto;
    
    public SobreMi() {
    }

    public SobreMi(Long id, String texto) {
        this.id = id;
        this.texto = texto;
    }
    
    
}



