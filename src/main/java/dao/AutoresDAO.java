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
import java.util.logging.Level;
import java.util.logging.Logger;
import modelos.Autores;

/**
 *
 * @author naperez
 */
public class AutoresDAO {
   
    public List<Autores> obtenerAutores() throws SQLException {
        List<Autores> autores = new ArrayList<>();
        String sql = "SELECT * FROM Autores";
            Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery(); 

            while (rs.next()) {
                Autores autor = new Autores(
                    rs.getInt("INE"),
                    rs.getString("Nombre"),                                       
                    rs.getString("Nacionalidad")
                );
                autores.add(autor);
            }
        

        return autores;
        
    }
    
    public void insertarAutor(Autores autor){
        try {
            String sql ="INSERT INTO Autores (INE,Nombre,Nacionalidad) VALUES (?,?,?)";
            Connection conn = Conexion.getConnection();
            PreparedStatement  st = conn.prepareStatement(sql);
            
            st.setInt(1, autor.getINE());
            st.setString(2, autor.getNombre());
            st.setString(3, autor.getNacionalidad());
            
            st.executeUpdate();
            System.out.println("Registro agregado correctamente");
        } catch (SQLException ex) {
            System.out.println("Error al insertar autor:"+ex.getMessage());
        }
        
                
        
        
        
    }
    
    
    public void eliminarAutor(int INE){
        
        try {
            String sql = "DELETE FROM Autores WHERE INE = ?";
            Connection conn = Conexion.getConnection();
            PreparedStatement  st = conn.prepareStatement(sql);
            
            st.setInt(1, INE);
            st.executeUpdate();
            System.out.println("Se eliminó");
        } catch (SQLException ex) {
            System.out.println("ERROR"+ex.getMessage());
            
        }
        
    
    }
    
    
    public void actualizarAutor(Autores autor){
        int ine = autor.getINE();
        try {
            String sql = "UPDATE Autores SET INE = ?, Nombre = ?, Nacionalidad = ?"
                    + " WHERE INE ='"+ ine +"'";
            Connection conn = Conexion.getConnection();
            PreparedStatement  st = conn.prepareStatement(sql);
            
            
            st.setInt(1, ine);
            st.setString(2, autor.getNombre());
            st.setString(3, autor.getNacionalidad());
            
            st.executeUpdate();
            System.out.println("Actualización correcta");
        } catch (SQLException ex) {
            System.out.println("NO se realizó actualización"+ex.getMessage());
            
            
        }
        
        
        
    }

    
    
    public List<Autores> buscarAutoresPorNombre(String nombre) {
        List<Autores> autores = new ArrayList<>();
        String sql = "SELECT * FROM Autores WHERE nombre LIKE ?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement st = conn.prepareStatement(sql)) {

            st.setString(1, "%" + nombre + "%");
            ResultSet resultSet = st.executeQuery();

            while (resultSet.next()) {
                Autores autor = new Autores(
                    resultSet.getInt("INE"),
                    resultSet.getString("Nombre"),
                    resultSet.getString("Nacionalidad")
                );
                autores.add(autor);
            }

            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo básico de excepciones, puede mejorarse según necesidades
        }
        return autores;
    }
    
    
  
    
}
