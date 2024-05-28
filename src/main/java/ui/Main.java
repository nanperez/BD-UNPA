/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

/**
 *
 * @author naperez
 */


import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelos.Autores;
import modelos.Libro;
import servicios.AutoresServicio;
import servicios.LibroServicio;

public class Main {
    public static void main(String[] args) {
        AutoresServicio autorService = new AutoresServicio();
        /*
        try {
            List<Autores> autores = autorService.obtenerAutores();
            for (Autores a : autores) {
                System.out.println(a);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    */
        Autores nuevoAutor = new Autores(4,"Nancy Perez","Mexicana");
        autorService.insertarAutor(nuevoAutor);
    
       // autorService.eliminarAutor(4);
    }
    
    
}
