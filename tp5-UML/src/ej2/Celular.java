/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej2;
/**
 *
 * @author dev-alejandropedrosa
 */
public class Celular {
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria; 
    private Usuario usuario; 

    public Celular(String imei, String marca, String modelo, Bateria bateria) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        if (usuario != null && usuario.getCelular() != this) {
            usuario.setCelular(this);
        }
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String getImei() {
        return imei;
    }

    @Override
    public String toString() {
        return "Celular{" +
               "imei=" + imei +
               ", marca=" + marca +
               ", modelo=" + modelo +
               ", bateria=" + (bateria != null ? bateria : "null") +
               ", usuario=" + (usuario != null ? usuario.getNombre() : "null") +
               '}';
    }
}
