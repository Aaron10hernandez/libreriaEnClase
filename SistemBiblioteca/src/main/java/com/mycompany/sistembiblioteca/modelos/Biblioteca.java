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

    public Biblioteca() {
    }

    public Biblioteca(ArrayList<Categoria> categorias, ArrayList<Autor> autores, ArrayList<Prestamo> prestamos) {
        this.categorias = categorias;
        this.autores = autores;
        this.prestamos = prestamos;
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

    public void setCategorias(ArrayList<Categoria> categorias) {
        this.categorias = categorias;
    }

    public void setAutores(ArrayList<Autor> autores) {
        this.autores = autores;
    }

    public void setPrestamos(ArrayList<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }
    
    
}
