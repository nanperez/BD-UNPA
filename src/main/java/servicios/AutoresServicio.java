/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import dao.AutoresDAO;
import java.sql.SQLException;
import java.util.List;
import modelos.Autores;

/**
 *
 * @author naperez
 */
public class AutoresServicio {
    
    private AutoresDAO autoresDAO;

    public AutoresServicio() {
        autoresDAO = new AutoresDAO();
    }
    
    
    public List<Autores> obtenerAutores() throws SQLException {
        return autoresDAO.obtenerAutores();
    }
    
    public void insertarAutor(Autores autor){
        autoresDAO.insertarAutor(autor);
    }
    
    
    
}
