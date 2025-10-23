/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author dev-alejandropedrosa
 */
public class Main {
     public static void main(String[] args) {
        //crear biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central UTN");
        System.out.println("Inicio gestion de la " + biblioteca.getNombre());
        
        //Crear autores
        Autor a1 = new Autor("AUT001", "Gabriel García Márquez", "Colombiana");
        Autor a2 = new Autor("AUT002", "J.K. Rowling", "Británica");
        Autor a3 = new Autor("AUT003", "Jorge Luis Borges", "Argentina");
        Autor a4 = new Autor("AUT004", "Isabel Allende", "Chilena");
        
        //Agregar libros asociados a los autores
        System.out.println("\n Agregar libro");
        biblioteca.agregarLibro("978-01", "Cien años de soledad", 1967, a1);
        biblioteca.agregarLibro("978-02", "El amor en los tiempos del cólera", 1985, a1); // Mismo autor
        biblioteca.agregarLibro("978-03", "Harry Potter y la Piedra Filosofal", 1997, a2);
        biblioteca.agregarLibro("978-04", "Ficciones", 1944, a3);
        biblioteca.agregarLibro("978-05", "La Casa de los Espíritus", 1982, a4);
        
        //listar todos los libros
        System.out.println("Libros listados");
        biblioteca.listarLibros();
        
        //buscar libro por isbn
        System.out.println("\n Buscar libro por Isbn");
        Libro encontrado = biblioteca.buscarLibroPorIsbn("978-04");
        if (encontrado != null) {
            System.out.println("Libro encontrado:");
            encontrado.mostrarInfo();
        }
        
        // Filtrar y mostrar los libros publicados en un año especifico
        System.out.println("\n Filtrar libro por año ");
        biblioteca.filtrarLibroPorAnio(1944);
        
        //Eliminar libro
        System.out.println("\n Eliminar libro");
        biblioteca.eliminarLibro("978-01");
        biblioteca.listarLibros();
        
        //Mostrar cantidad total
        System.out.println("\n Cantidad total de libros");
        System.out.println("Total de libros en la biblioteca: " + biblioteca.obtenerCantidadLibros());
        
        // Mostrar autores disponibles
        System.out.println("\n Autores disponibles");
        biblioteca.mostrarAutoresDisponibles();
    }
}
