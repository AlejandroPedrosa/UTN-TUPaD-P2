/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dev-alejandropedrosa
 */

public class NaveEspacial {
    private String nombre;
    private int combustible;        
    private final int capacidadMax; 

    // Consumo: 1 unidad por distancia
    private static final int CONSUMO_POR_UNIDAD = 1;

    public NaveEspacial(String nombre, int combustibleInicial, int capacidadMax) {
        this.nombre = nombre;
        this.capacidadMax = Math.max(1, capacidadMax);
        this.combustible = Math.max(0, Math.min(combustibleInicial, this.capacidadMax));
    }

    public void despegar() {
        if (combustible > 0) {
            System.out.println(nombre + " ha despegado. Combustible: " + combustible);
        } else {
            System.out.println("No hay combustible para despegar.");
        }
    }

    public void avanzar(int distancia) {
        if (distancia <= 0) {
            System.out.println("La distancia debe ser positiva.");
            return;
        }
        int requerido = distancia * CONSUMO_POR_UNIDAD;
        if (combustible >= requerido) {
            combustible -= requerido;
            System.out.println(nombre + " avanzó " + distancia + " unidades. Combustible restante: " + combustible);
        } else {
            System.out.println("Combustible insuficiente. Requerido: " + requerido + ", disponible: " + combustible);
        }
    }

    public void recargarCombustible(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad a recargar debe ser positiva.");
            return;
        }
        int nuevoNivel = combustible + cantidad;
        if (nuevoNivel > capacidadMax) {
            int agregado = capacidadMax - combustible;
            combustible = capacidadMax;
            System.out.println("Se recargó hasta el máximo (" + agregado + "). Nivel: " + combustible + "/" + capacidadMax);
        } else {
            combustible = nuevoNivel;
            System.out.println("Recarga exitosa. Nivel: " + combustible + "/" + capacidadMax);
        }
    }

    public void mostrarEstado() {
        System.out.println("Nave: " + nombre + " | Combustible: " + combustible + "/" + capacidadMax);
    }

    // Getters
    public String getNombre() { return nombre; }
    public int getCombustible() { return combustible; }
    public int getCapacidadMax() { return capacidadMax; }
}
