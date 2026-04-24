/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistembiblioteca.vista;

import com.mycompany.sistembiblioteca.modelos.Autor;
import static com.mycompany.sistembiblioteca.modelos.Autor.buscarNombreAutor;
import com.mycompany.sistembiblioteca.modelos.Biblioteca;
import com.mycompany.sistembiblioteca.modelos.Categoria;
import static com.mycompany.sistembiblioteca.modelos.Categoria.buscarNombreCategoria;
import static com.mycompany.sistembiblioteca.modelos.Categoria.buscarNombreLibro;
import com.mycompany.sistembiblioteca.modelos.Libro;
import com.mycompany.sistembiblioteca.modelos.Prestamo;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class SistemBiblioteca {
    
    public static void main(String[] args) {
        
        Biblioteca biblioteca = new Biblioteca();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=======SISTEMA GESTION BIBLIOTECA==========");
        
        int opcion=0;
        
        do{
            System.out.println("1. Crear nueva categoria");
            System.out.println("2. Agregar nuevo Autor");
            System.out.println("3. Agregar nuevo Libro");
            System.out.println("4. Realizar Préstamo");
            System.out.println("5. Devolver Libro Prestado");
            System.out.println("6. Ver Libros Disponibles");
            System.out.println("7. Ver Detalles de Autor");
            System.out.println("8. Ver Libros de una Categoría");
            System.out.println("9. Ver Multas Acumuladas");
            System.out.println("10. Ver Estadísticas");
            System.out.println("0. Salir");
            
            switch(opcion){
                
                case 1:
                    
                    System.out.println("Ingrese nombre de la nueva categoria: ");
                    String nombre = sc.nextLine();
                    Categoria nuevaCategoria = new Categoria(nombre);
                    
                    biblioteca.setCategorias(nuevaCategoria);
                    
                    break;
                  
                case 2:
                    System.out.println("Ingrese id del nuevo autor: ");
                    String id = sc.nextLine();
                    System.out.println("Ingrese nombre del nuevo autor: ");
                    nombre = sc.nextLine();
                    System.out.println("Ingrese pais del nuevo autor: ");
                    String pais = sc.nextLine();
                    System.out.println("Ingrese anio de nacimiento del nuevo autor: ");
                    int anio = sc.nextInt();
                    
                    Autor nuevoAutor = new Autor(nombre,id,pais,anio);
                    biblioteca.setAutores(nuevoAutor);
                    
                    break;
                    
                case 3:
                    System.out.println("Ingrese titulo del nuevo libro: ");
                    nombre = sc.nextLine();
                    System.out.println("Ingrese el isbn del nuevo libro: ");
                    String isbn = sc.nextLine();
                    System.out.println("Ingrese nombre del autor del nuevo libro: ");
                    String nombreAutor = sc.nextLine();
                    System.out.println("Ingrese nombre del autor del nuevo libro: ");
                    String nombreCategoria = sc.nextLine();
                    
                    Libro nuevoLibro = new Libro(isbn,nombre,buscarNombreAutor(nombreAutor,biblioteca),buscarNombreCategoria(nombreCategoria, biblioteca),true);
                    
                    
                    
                    break;
                    
                case 4:
                    
                    System.out.println("Ingresa el nombre del libro:");
                    nombre = sc.nextLine();
                    System.out.println("Ingresa usuario:");
                    nombreAutor=sc.nextLine();
                    
                    Libro eso = buscarNombreLibro(nombre,biblioteca);
                    
                    
                    if(eso==null){
                        System.out.println("ERROR");
                    }else{
                        Prestamo nuevoPrestamo = new Prestamo(eso,nombreAutor,"11/11/2002");
                        biblioteca.setPrestamos(nuevoPrestamo);
                    }
                    
                    
                    
                    
                    break; 
                    
                case 5:
                    
                    System.out.println("LIBROS DISPONIBLES:");
                    
                    for(int i =0, i<)
                        System.out.println(biblioteca.getCategorias().get(i));
                    
                    break;
                  
                case 6:
                    
                    break;
                    
                    
                case 7:
                    
                    break;
                    
                case 8:
                    
                    break;
                    
                case 9:
                    
                    break;
                  
                case 10:
                    
                    break;
                    
                case 11:
                    System.exit(0);
                    break;   
                    
                default:
                    System.out.println("Error! Ingrese una opcion valida...");
                    break;
                
                
            }
            
            
            
            
            
            
            
        }while(opcion != 0) ;
        
    }
}
       