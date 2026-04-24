/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistembiblioteca.modelos;
import java.util.UUID;

/**
 *
 * @author ESTUDIANTE
 */
public class Autor {
    private String idAutor;
    private  final String name;
    private String paisAutor;
    private int anioNacimientoAutor;

    public Autor(String name, String idAutor, String paisAutor, int anioNacimientoAutor) {
        this.name = name;
        this.idAutor = UUID.randomUUID().toString();        // genera ID's aleatorios a cada autor
        this.paisAutor = paisAutor;
        this.anioNacimientoAutor = anioNacimientoAutor;
    }

    public String getIdAutor() {
        return idAutor;
    }

    public final String getName() {
        return name;
    }

    public String getPaisAutor() {
        return paisAutor;
    }

    public int getAnioNacimientoAutor() {
        return anioNacimientoAutor;
    }

    public void setPaisAutor(String paisAutor) {
        this.paisAutor = paisAutor;
    }

    public void setAnioNacimientoAutor(int anioNacimientoAutor) {
        this.anioNacimientoAutor = anioNacimientoAutor;
    }

    @Override
    public String toString() {
        return "Autor{" + "idAutor=" + idAutor + ", paisAutor=" + paisAutor + ", anioNacimientoAutor=" + anioNacimientoAutor + '}';
    }

    public static Autor buscarNombreAutor(String nombre, Biblioteca biblioteca){
            
        Autor variable = null;
        for(int i=0; i<biblioteca.getAutores().size();i++){
            
            if(nombre.equals(biblioteca.getAutores().get(i).getName())){
                
                 variable = biblioteca.getAutores().get(i);
            }
            
        }
        return variable;
    }
    
    public void verDetallesAutor(String nombre, Biblioteca biblioteca)  {
        Autor variable = buscarNombreAutor(nombre, biblioteca); 
        System.out.println("\t----INFORMACION DEL AUTOR----\t");
        System.out.println("Nombre: " + getName());
        System.out.println("Id: " + getIdAutor());
        System.out.println("Pais: "+ getPaisAutor());
        System.out.println("Año de nacimiento: "+ getAnioNacimientoAutor());
    }
}
