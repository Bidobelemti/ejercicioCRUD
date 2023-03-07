/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.FileInputStream;

/**
 *
 * @author LabP41011
 */
public class Pokemon {
    private int id;
    private String nombre;
    private FileInputStream imagen;
    private int longitudImagen;

    public Pokemon(int id, String nombre, FileInputStream imagen) {
        this.id = id;
        this.nombre = nombre;
        this.imagen = imagen;
    }

    public Pokemon() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public FileInputStream getImagen() {
        return imagen;
    }

    public void setImagen(FileInputStream imagen) {
        this.imagen = imagen;
    }

    public int getLongitudImagen() {
        return longitudImagen;
    }

    public void setLongitudImagen(int longitudImagen) {
        this.longitudImagen = longitudImagen;
    }
    
    
}
