/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import java.util.Objects;

/**
 *
 * @author juan esteban
 */
public class PersonaDTO {
private String Nombre;
private String Apellido;
private String Correo;
private int Telefono;
private String Clave;

    public PersonaDTO(String Nombre, String Apellido, String Correo, int Telefono, String Contraseña) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Correo = Correo;
        this.Telefono = Telefono;
        this.Clave = Clave;
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
        return Clave;
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
        this.Clave = Contraseña;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.Nombre);
        hash = 11 * hash + Objects.hashCode(this.Apellido);
        hash = 11 * hash + Objects.hashCode(this.Correo);
        hash = 11 * hash + this.Telefono;
        hash = 11 * hash + Objects.hashCode(this.Clave);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PersonaDTO other = (PersonaDTO) obj;
        if (this.Telefono != other.Telefono) {
            return false;
        }
        if (!Objects.equals(this.Nombre, other.Nombre)) {
            return false;
        }
        if (!Objects.equals(this.Apellido, other.Apellido)) {
            return false;
        }
        if (!Objects.equals(this.Correo, other.Correo)) {
            return false;
        }
        return Objects.equals(this.Clave, other.Clave);
    }

}

