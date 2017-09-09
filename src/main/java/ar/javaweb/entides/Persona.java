/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.javaweb.entides;

/**
 *
 * @author a211589
 */
public class Persona {
    
    private String name;
    private String lastName;
    private String age;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String edad) {
        this.name=nombre;
        this.lastName=apellido;
        this.age=edad;
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    
    
    
}
