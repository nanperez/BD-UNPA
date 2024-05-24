/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

/**
 *
 * @author naperez
 */


import java.sql.SQLException;
import java.util.List;
import modelos.Libro;
import servicios.LibroServicio;

public class Main {
    public static void main(String[] args) {
        LibroServicio libroService = new LibroServicio();
        try {
            List<Libro> libros = libroService.obtenerLibros();
            for (Libro libro : libros) {
                System.out.println(libro);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
