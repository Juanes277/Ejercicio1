/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juan esteban
 */
public class PersonaDAO {
    
private static final String SQL_READALL = "SELECT * FROM tb_persona ";
    private static final Conexion con = Conexion.getConexion();

    public PersonaDAO() {
        con.conectar();
    }

    public List<PersonaDTO> readAll(){
        List<PersonaDTO> lista = null;
        PreparedStatement ps;
        try{
            ps = con.getConectar().prepareStatement(SQL_READALL);
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<>();
            while(rs.next()){
                PersonaDTO obj = new PersonaDTO(
                    rs.getString("Nombre"),
                    rs.getString("Apellido"),
                    rs.getString("Correo"),
                    rs.getInt("Telefono"),
                    rs.getString("Clave")
                );  lista.add(obj);
            }
        }catch(SQLException ex){
            System.out.println("Error al conectar: " + ex);
        }
        return lista;
    }
}
