/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author LabP41011
 */
public class ConsultasPokemon extends Conexion {

    public boolean insertarPokemon(Pokemon p) {
        Connection con = getConexion();
        String sql = "INSERT INTO pokemon (id, nombre, imagen) VALUES (?, ?, ?)";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, p.getId());
            ps.setString(2, p.getNombre());
            ps.setBinaryStream(3, p.getImagen(),p.getLongitudImagen());
            ps.execute();
            return true;
        } catch (SQLException e) {
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {

            }
        }

    }

}
