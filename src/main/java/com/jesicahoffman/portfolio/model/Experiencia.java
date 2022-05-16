
package com.jesicahoffman.portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experiencia {
    
     @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String empresa;
    private String cargo;
    private String fechaInicio;
    private String fechaFin;
    private String proyecto;
    
    public Experiencia() {
    }

    public Experiencia(Long id, String empresa, String cargo, String fechaInicio, String fechaFin, String proyecto) {
        this.id = id;
        this.empresa = empresa;
        this.cargo = cargo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.proyecto = proyecto;
    }
    
    
}
