/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author juan esteban
 */
public class Conexion {
    private static Conexion conex;
    private Connection conectar;
    private String BD;
    private String usuario;
    private String contra;

    public Conexion() {
        this.BD = "";
        this.usuario = "";
        this.contra = "";
    }


   public synchronized static Conexion getConexion() {
       if (conex == null) {
           conex = new Conexion();
       }
       return conex;
   }


    public void conectar(){
        try{
            Class.forName("org.postgresql.Driver");
            this.BD = "BDSanchez";
            this.usuario = "postgre";
            this.contra = "123456";
            this.conectar = (Connection) DriverManager.getConnection(BD, usuario, contra);
        }catch(ClassNotFoundException | HeadlessException | SQLException e ){
            System.out.println("Error al conectar: " + e);
        }
    }

    public Connection getConectar() {
        return conectar;
    }    
}
