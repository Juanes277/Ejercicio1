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
    private int Telefono;
    private String Email;
    private String Password;

    public PersonaDTO() {
        Nombre = "";
        Telefono = 0;
        Email = "";
        Password = "";
    }

    public PersonaDTO(String Nombre, int Telefono, String Email, String Password) {
        this.Nombre = Nombre;
        this.Telefono = Telefono;
        this.Email = Email;
        this.Password = Password;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    @Override
    public String toString() {
        return "personaDTO{" + "Nombre=" + Nombre + ", Telefono=" + Telefono + ", Email=" + Email + ", Password=" + Password + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + Objects.hashCode(this.Nombre);
        hash = 19 * hash + this.Telefono;
        hash = 19 * hash + Objects.hashCode(this.Email);
        hash = 19 * hash + Objects.hashCode(this.Password);
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
        if (!Objects.equals(this.Email, other.Email)) {
            return false;
        }
        return Objects.equals(this.Password, other.Password);
    }

}

