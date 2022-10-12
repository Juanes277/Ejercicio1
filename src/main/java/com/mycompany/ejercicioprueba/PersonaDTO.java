/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioprueba;

/**
 *
 * @author juan esteban
 */
public class PersonaDTO {
private String Nombre;
private String Apellido;
private String Correo;
private int Telefono;
private String Contraseña;

    public PersonaDTO(String Nombre, String Apellido, String Correo, int Telefono, String Contraseña) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Correo = Correo;
        this.Telefono = Telefono;
        this.Contraseña = Contraseña;
    }

    public PersonaDTO() {
    }
//GETS
    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getCorreo() {
        return Correo;
    }

    public int getTelefono() {
        return Telefono;
    }

    public String getContraseña() {
        return Contraseña;
    }
//SETS
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

}

