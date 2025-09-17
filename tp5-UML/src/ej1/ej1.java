/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej1;

/**
 *
 * @author dev-alejandropedrosa
 */
public class ej1 {
    public static void main(String[] args) {
        // Crear titular
        Titular titular = new Titular("Alejandro Pedrosa", "12345678");

        // Crear pasaporte con su foto (la composición ocurre aquí)
        Pasaporte pasaporte = new Pasaporte("ARG-12345", "8/11/2025", "fotodeperfil.jpg", "jpg");
        titular.setPasaporte(pasaporte);

        // Mostrar información pasaporte
        System.out.println("Pasaporte:");
        System.out.println(pasaporte);

        // Mostrar información titular
        System.out.println("Titular:");
        System.out.println(titular);

    }
    
}
