/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej7;

/**
 *
 * @author dev-alejandropedrosa
 */
public class ej7 {
     public static void main(String[] args) {
        // Crear motor (puede existir independientemente del vehículo)
        Motor motor = new Motor("Nafta", "Motor1.6");

        // Crear conductor
        Conductor conductor = new Conductor("Alejandro Pedrosa", "LicenciaB2-ASD123");

        // Crear vehículo y asociarle el motor
        Vehiculo vehiculo = new Vehiculo("ZZZ-123", "Fiat Pulse", motor);

        // Asociar bidireccionalmente vehículo y conductor
        conductor.setVehiculo(vehiculo);

        // Mostrar información vehículo
        System.out.println("Vehículo:");
        System.out.println(vehiculo);

        // Mostrar información conductor
        System.out.println("\nConductor:");
        System.out.println(conductor);

        // Mostrar información del motor
        System.out.println("\nMotor asociado:");
        System.out.println(motor);
    }
    
}
