/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dev-alejandropedrosa
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean seguir = true;

        while (seguir) {
            System.out.println("\n=== TP3 - Introducción a la POO ===");
            System.out.println("1) Registro de Estudiantes");
            System.out.println("2) Registro de Mascotas");
            System.out.println("3) Encapsulamiento con Libro");
            System.out.println("4) Gestión de Gallinas");
            System.out.println("5) Simulación de Nave Espacial");
            System.out.println("0) Salir");
            System.out.print("Elegí una opción: ");

            String op = sc.nextLine().trim();
            switch (op) {
                case "1":
                    demoEstudiante();
                    break;
                case "2":
                    demoMascota();
                    break;
                case "3":
                    demoLibro();
                    break;
                case "4":
                    demoGallinas();
                    break;
                case "5":
                    demoNave();
                    break;
                case "0":
                    seguir = false;
                    System.out.println("Fin del programa.");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }

        sc.close();
    }

    private static void demoEstudiante() {
        System.out.println("\n-- Demo Estudiante --");
        Estudiante e = new Estudiante("Ana", "Gómez", "Programación II", 7.5);
        e.mostrarInfo();
        e.subirCalificacion(1.0);
        System.out.println("\nSe sube 1 punto la calificacion");
        e.mostrarInfo();
        System.out.println("\nSe baja 3 puntos la calificacion");
        e.bajarCalificacion(3.0);
        e.mostrarInfo();
    }

    private static void demoMascota() {
        System.out.println("\n-- Demo Mascota --");
        Mascota m = new Mascota("Snoopy", "Perro", 3);
        m.mostrarInfo();
        m.cumplirAnios();
        System.out.println("\nFeliz cumpleaños Snoopy!!");
        m.mostrarInfo();
    }

    private static void demoLibro() {
        System.out.println("\n-- Demo Libro --");
        Libro l = new Libro("El Principito", "Antoine de Saint-Exupéry", 1943);
        l.mostrarInfo();
        
        // Intento inválido
        System.out.println("\nSe intenta cambiar el año de publicacion a 1300");
        l.setAnioPublicacion(1300);
        
        // Intento válido
        System.out.println("\nSe intenta cambiar el año de publicacion a 1950");
        l.setAnioPublicacion(1950);
        l.mostrarInfo();
    }

    private static void demoGallinas() {
        System.out.println("\n-- Demo Gallinas --");
        Gallina g1 = new Gallina("Gallina-001", 1);
        Gallina g2 = new Gallina("Marty McFly Gallina-002", 2);

        g1.mostrarEstado();
        g2.mostrarEstado();

        g1.envejecer();
        g1.ponerHuevo();
        g1.ponerHuevo();

        g2.envejecer();
        g2.ponerHuevo();

        g1.mostrarEstado();
        g2.mostrarEstado();
    }

    private static void demoNave() {
        System.out.println("\n-- Demo Nave Espacial --");
        
        // Requisito: crear con 50 de combustible. Definimos capacidad maxima en 100.
        NaveEspacial nave = new NaveEspacial("Halcon Milenario", 50, 100);
        nave.mostrarEstado();
        nave.despegar();
        
        // Intentar avanzar sin recargar suficiente
        System.out.println("Intentar avanzar 60 unidades sin combustible suficiente");
        nave.avanzar(60);       // debería quejarse por combustible insuficiente
        System.out.println("Recargamos combustible");
        nave.recargarCombustible(40); // sube a 90/100
        
        nave.avanzar(60);       // ahora sí alcanza (consume 60, queda 30)
        nave.mostrarEstado();
    }
}

