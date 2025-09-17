/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej8;

/**
 *
 * @author dev-alejandropedrosa
 */
public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firma;

    public Documento(String titulo, String contenido, String codigoHash, String fecha, Usuario usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firma = new FirmaDigital(codigoHash, fecha, usuario);
    }

    public FirmaDigital getFirma() {
        return firma;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "Documento{" +
               "titulo=" + titulo +
               ", contenido=" + contenido +
               ", firma=" + firma +
               '}';
    }
}