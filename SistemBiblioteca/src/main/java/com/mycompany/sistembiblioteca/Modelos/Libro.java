/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistembiblioteca.modelos;

import com.mycompany.sistembiblioteca.Modelos.Autor;
import com.mycompany.sistembiblioteca.modelos.Categoria;


/**
 *
 * @author ESTUDIANTE
 */
public class Libro {
    private static final String isbn = "010101";
    private static final String titulo = "El mago de Oz";
    private Autor autor;
    private Categoria categoria;

    public Libro() {
    }

    public Libro(Autor autor, Categoria categoria) {
        this.autor = autor;
        this.categoria = categoria;
    }

    public static String getIsbn() {
        return isbn;
    }

    public static String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Libro{" + "autor=" + autor + ", categoria=" + categoria + '}';
    }
    
    
}
