/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dev-alejandropedrosa
 */
import java.util.Scanner;

public class IngresoDatosPuntoCuatro {
    public static void main(String[] args) {
        // Crear el objeto Scanner para leer desde teclado
        Scanner scanner = new Scanner(System.in);

        // Solicitar el nombre
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        // Solicitar la edad
        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        // Mostrar los datos ingresados
        System.out.println("Hola " + nombre + ", tu edad es " + edad + " años.");
       
        scanner.close();
    }
}
