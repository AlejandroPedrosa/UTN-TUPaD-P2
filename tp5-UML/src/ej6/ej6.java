/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej6;

/**
 *
 * @author dev-alejandropedrosa
 */
public class ej6 {
    public static void main(String[] args) {
        // Crear cliente
        Cliente cliente = new Cliente("María López", "1122334455");

        // Crear mesa
        Mesa mesa = new Mesa(5, 4);

        // Crear reserva asociando cliente y mesa
        Reserva reserva = new Reserva("07/09/2025", "20:00", cliente, mesa);

        // Mostrar información  reserva
        System.out.println(" Reserva:");
        System.out.println(reserva);

        // Mostrar información del cliente
        System.out.println("\nInformación del Cliente:");
        System.out.println(cliente);

        // Mostrar información de la mesa
        System.out.println("\nInformación de la Mesa:");
        System.out.println(mesa);
    }
    
}
