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
public class Usuario {
    private String userName;
    private String userPass;
    private String name;
    private String lastName;

    public Usuario(String userName, String userPass, String name, String lastName) {
        this.userName = userName;
        this.userPass = userPass;
        this.name = name;
        this.lastName = lastName;
    }
 
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
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

    @Override
    public boolean equals(Object o) {
        Usuario aux = (Usuario) o;
        if ((this.userName.equals(aux.userName)) && (this.userPass.equals(aux.userPass))){
            return true;
        }
        else{return false;}
    }
    
    
    
}
