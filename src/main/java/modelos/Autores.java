/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author naperez
 */
public class Autores {
    private int INE;
    private String nombre;
    private String nacionalidad;

    public Autores(int INE, String nombre, String nacionalidad) {
        this.INE = INE;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public int getINE() {
        return INE;
    }

    public void setINE(int INE) {
        this.INE = INE;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Autores{" + "INE=" + INE + ", nombre=" + nombre + ", nacionalidad=" + nacionalidad + '}';
    }
    
    
    
 
    }
    
    
    
    
    

