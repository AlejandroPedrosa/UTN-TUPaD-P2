/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej14;

/**
 *
 * @author dev-alejandropedrosa
 */
public class EditorVideo {
    public Render exportar(String formato, Proyecto proyecto) {
        Render render = new Render(formato, proyecto);
        System.out.println("Exportando proyecto '" + proyecto.getNombre() + "' en formato " + formato);
        return render;
    }
}