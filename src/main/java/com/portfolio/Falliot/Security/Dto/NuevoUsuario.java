/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.Falliot.Security.Dto;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Fermin
 */
public class NuevoUsuario {
    private String nombre;
    private String nombreUsuario;
    private String email;
    private String password;
    private Set<String> roles = new HashSet<>();
    
    //Getters and Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<String> getRoles() {
        return roles;
    } // a este le modifique el <any> por el Set<String>

    public void setRoles(Set<String> roles) {
        this.roles = roles;
    } // a este le modifique el <any> por el Set<String>
}
