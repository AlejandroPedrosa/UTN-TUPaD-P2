/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej11;
/**
 *
 * @author dev-alejandropedrosa
 */
public class Reproductor {
    public void reproducir(Cancion cancion) {
        if (cancion != null) {
            System.out.println("Reproduciendo: " + cancion.getTitulo() +
                               " de " + cancion.getArtista().getNombre());
        } else {
            System.out.println("No hay canción para reproducir.");
        }
    }
}