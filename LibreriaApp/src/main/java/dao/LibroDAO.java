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
import modelos.Libro;

public class LibroDAO {
    public List<Libro> obtenerLibros() throws SQLException {
        List<Libro> libros = new ArrayList<>();
        String sql = "SELECT * FROM Libros";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Libro libro = new Libro(
                    rs.getInt("ISBN"),
                    rs.getString("Titulo"),                    
                    rs.getBigDecimal("Precio"),
                    rs.getString("Genero")
                );
                libros.add(libro);
            }
        }

        return libros;
    }

    // Métodos CRUD (crear, actualizar, eliminar) pueden ser añadidos aquí.
}

