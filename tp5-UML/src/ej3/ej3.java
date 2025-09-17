/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej3;

/**
 *
 * @author dev-alejandropedrosa
 */
public class ej3 {
    public static void main(String[] args) {
        // Crear autor
        Autor autor = new Autor("Eduardo Galeano", "Uruguayo");

        // Crear editorial
        Editorial editorial = new Editorial("Editorial Porteña Argentina", "Buenos Aires, Argentina");

        // Crear libro con autor y editorial
        Libro libro = new Libro("Las venas abiertas de America Latina", "978-987-801-067-0", autor, editorial);

        // Mostrar información del libro
        System.out.println("Información del Libro:");
        System.out.println(libro);

        // Mostrar información del autor
        System.out.println("\nInformación del Autor:");
        System.out.println(autor);

        // Mostrar información de la editorial
        System.out.println("\nInformación de la Editorial:");
        System.out.println(editorial);
    }
    
}
