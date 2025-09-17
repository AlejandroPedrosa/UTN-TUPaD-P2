/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej9;

/**
 *
 * @author dev-alejandropedrosa
 */
public class ej9 {
    public static void main(String[] args) {
        // Crear paciente
        Paciente paciente = new Paciente("Alejandro Pedrosa", "OSDE");

        // Crear profesional
        Profesional profesional = new Profesional("Dra. Lorena Ramirez", "Traumatologia");

        // Crear cita médica asociando paciente y profesional
        CitaMedica cita = new CitaMedica("15/09/2025", "16:30", paciente, profesional);

        // Mostrar información de la cita
        System.out.println("Información de la Cita Médica:");
        System.out.println(cita);

        // Mostrar información del paciente
        System.out.println("\nInformación del Paciente:");
        System.out.println(paciente);

        // Mostrar información del profesional
        System.out.println("\nInformación del Profesional:");
        System.out.println(profesional);
    }
    
}
