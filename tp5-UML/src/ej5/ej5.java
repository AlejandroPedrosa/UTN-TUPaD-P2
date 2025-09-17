/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej5;

import ej1.*;

/**
 *
 * @author dev-alejandropedrosa
 */
public class ej5 {

    public static void main(String[] args) {
        // Crear propietario
        Propietario propietario = new Propietario("Alejandro Pedrosa", "42123321");

        // Crear computadora con su placa madre (composición)
        Computadora pc = new Computadora("Asus", "AB231", "PlacaMadre123", "AMD Ryzen 7");

        // Asociar bidireccionalmente propietario y computadora
        propietario.setComputadora(pc);

        // Mostrar información  computadora
        System.out.println("Computadora:");
        System.out.println(pc);

        // Mostrar información propietario
        System.out.println("\nPropietario:");
        System.out.println(propietario);
    }
    
}
