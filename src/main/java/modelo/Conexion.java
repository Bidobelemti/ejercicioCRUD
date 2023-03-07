/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author LabP41011
 */
public class Conexion {
    Connection conexion = null;
    
    String base = "ejerciciopoo";
    String url = "jdbc:postgresql://localhost:5432/ejerciciopoo";
    String usuario = "postgres";
    String contraseña = "admin2023";
    
    public Connection getConexion(){
        try {
            Class.forName("org.postgresql.driver");
            conexion = DriverManager.getConnection(url, usuario, contraseña);
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println("e");
        }
        return conexion;
    }
}
