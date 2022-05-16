
package com.jesicahoffman.portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String titulo;
    private String institucion;
    private String fechaInicio;
    private String fechaFin;
    
    public Educacion() {
    }

    public Educacion(Long id, String titulo, String institucion, String fechaInicio, String fechaFin) {
        this.id = id;
        this.titulo = titulo;
        this.institucion = institucion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }
    
    

}
