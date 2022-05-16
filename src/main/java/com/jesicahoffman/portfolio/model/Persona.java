
package com.jesicahoffman.portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String apellido;
    private String dni;
    private String fechaNacimiento;
    private String mail;
    private String linkedin;
    private String telefono;
    private String nacionalidad;
    
    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, String dni, String fechaNacimiento, String mail, String linkedin, String telefono, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.mail = mail;
        this.linkedin = linkedin;
        this.telefono = telefono;
        this.nacionalidad = nacionalidad;
    }
    
}
