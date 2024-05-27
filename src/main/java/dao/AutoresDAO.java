/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelos.Autores;

/**
 *
 * @author naperez
 */
public class AutoresDAO {

    public List<Autores> obtenerAutores() throws SQLException {
        List<Autores> autores = new ArrayList<>();
        String sql = "SELECT * FROM Autores";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Autores autor = new Autores(
                    rs.getInt("INE"),
                    rs.getString("Nombre"),                                       
                    rs.getString("Nacionalidad")
                );
                autores.add(autor);
            }
        }

        return autores;
        
    }
    
}
