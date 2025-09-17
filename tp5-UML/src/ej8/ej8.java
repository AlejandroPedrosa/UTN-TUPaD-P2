/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej8;

/**
 *
 * @author dev-alejandropedrosa
 */
public class ej8 {
     public static void main(String[] args) {
        // Crear usuario
        Usuario usuario = new Usuario("Alejandro Pedrosa", "alejandropedrosa@gmail.com");

        // Crear documento con firma digital 
        Documento documento = new Documento(
                "Contrato de Alquiler de casa",
                "Contenido del contrato:",
                "HASHEjemplo123",
                "16/09/2025",
                usuario
        );

        // Mostrar información documento
        System.out.println("Documento:");
        System.out.println(documento);

        // Mostrar información de la firma digital
        System.out.println("\nFirma Digital dentro del Documento:");
        System.out.println(documento.getFirma());

        // Mostrar información del usuario
        System.out.println("\nUsuario:");
        System.out.println(usuario);
    }
    
}
