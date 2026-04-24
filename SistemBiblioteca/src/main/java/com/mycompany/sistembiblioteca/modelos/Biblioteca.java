/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistembiblioteca.modelos;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class Biblioteca {
    
    private ArrayList<Categoria> categorias;
    private ArrayList<Autor> autores;
    private ArrayList < Prestamo> prestamos;
    private ArrayList <Libro> Libro;

    public Biblioteca() {
    }

    public Biblioteca(ArrayList<Categoria> categorias, ArrayList<Autor> autores, ArrayList<Prestamo> prestamos) {
        this.categorias = new ArrayList<>();
        this.autores = new ArrayList<>();
        this.prestamos = new ArrayList<>();
    }

    public ArrayList<Categoria> getCategorias() {
        return categorias;
    }

    public ArrayList<Autor> getAutores() {
        return autores;
    }

    public ArrayList<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setCategorias(Categoria nuevaCategoria) {
        this.categorias.add(nuevaCategoria);
    }

    public void setAutores(Autor nuevoAutor) {
        this.autores.add(nuevoAutor);
    }

    public void setPrestamos(Prestamo nuevoPrestamo) {
        this.prestamos.add(nuevoPrestamo);
    }
    
    
}
