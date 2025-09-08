/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dev-alejandropedrosa
 */
import java.util.Scanner;

public class DivisionEnterosPuntoOcho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número entero: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número entero: ");
        int num2 = scanner.nextInt();

        if (num2 != 0) {
            int resultado = num1 / num2; // División entera
            System.out.println("Resultado de la división (int): " + resultado);
        } else {
            System.out.println("No se puede dividir por cero.");
        }

        scanner.close();
    }
}
