/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej5;

/**
 *
 * @author dev-alejandropedrosa
 */
public class Propietario {
    private String nombre;
    private String dni;
    private Computadora computadora;

    public Propietario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
        if (computadora != null && computadora.getPropietario() != this) {
            computadora.setPropietario(this);
        }
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Propietario{" +
               "nombre=" + nombre +
               ", dni=" + dni +
               ", computadora=" + (computadora != null ? computadora.getNumeroSerie() : "null") +
               '}';
    }
}

