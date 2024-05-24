/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import dao.LibroDAO;
import java.sql.SQLException;
import java.util.List;
import modelos.Libro;

public class LibroServicio {
    private LibroDAO libroDAO;

    public LibroServicio() {
        libroDAO = new LibroDAO();
    }

    public List<Libro> obtenerLibros() throws SQLException {
        return libroDAO.obtenerLibros();
    }

    // Otros métodos de lógica de negocio pueden ser añadidos aquí.
}
