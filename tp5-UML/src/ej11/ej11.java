/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej11;

/**
 *
 * @author dev-alejandropedrosa
 */
public class ej11 {
     public static void main(String[] args) {
        // Crear artista
        Artista artista = new Artista("Rufus du sol", "Electronica");

        // Crear canción asociada al artista
        Cancion cancion = new Cancion("Innerbloom", artista);

        // Crear reproductor
        Reproductor reproductor = new Reproductor();

        // Usar el reproductor para reproducir la canción (dependencia de uso)
        reproductor.reproducir(cancion);

        // Mostrar información de la canción
        System.out.println("\nInformación de la Canción:");
        System.out.println(cancion);

         // Mostrar información del artista
        System.out.println("\nInformación del Artista:");
        System.out.println(artista);
    }
    
}
