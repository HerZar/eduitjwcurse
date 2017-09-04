/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.javaweb.entides;

import javax.persistence.*;

/**
 *
 * @author a211589
 */
@Entity
@Table (name = "alumnos")
public class Alumno {
    @Id
    @GeneratedValue
    @Column(name="id")
    long id;
    @Column(name = "nombre")
    String name;
    @Column(name = "apellido")
    String lastName;

    public Alumno(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    
    public Alumno() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
 
    
}
