/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.programacion.estructurada;

/**
 *
 * @author dev-alejandropedrosa
 */
import java.util.Scanner;

public class tp2 {
    // variable "global" para el ejercicio 11
    static final double DESCUENTO_ESPECIAL = 0.10;

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int op;

        do {
            mostrarMenu();
            op = in.nextInt();

            switch (op) {
                case 1 -> punto1_anioBisiesto();
                case 2 -> punto2_mayorDeTres();
                case 3 -> punto3_clasificarEdad();
                case 4 -> punto4_descuentoCategoria();
                case 5 -> punto5_sumaPares();
                case 6 -> punto6_contarPosNegCeros();
                case 7 -> punto7_validarNota();
                case 8 -> punto8_precioFinal();
                case 9 -> punto9_envioYTotal();
                case 10 -> punto10_actualizarStock();
                case 11 -> punto11_descuentoEspecial();
                case 12 -> punto12_modificarArray();
                case 13 -> punto13_imprimirRecursivo();
                case 0 -> System.out.println("Programa finalizado.");
                default -> System.out.println("Opción inválida.");
            }

            if (op != 0) {
                System.out.println("\n(Enter para seguir)");
                in.nextLine(); // limpia salto de línea pendiente
                in.nextLine();
            }

        } while (op != 0);
    }

    static void mostrarMenu() {
        System.out.println("\n===== TP2 - MENÚ =====");
        System.out.println("1) Año bisiesto");
        System.out.println("2) Mayor de tres números");
        System.out.println("3) Clasificación de edad");
        System.out.println("4) Descuento por categoría (A/B/C)");
        System.out.println("5) Suma de pares (while, termina con 0)");
        System.out.println("6) Contador + / - / 0 (for, 10 números)");
        System.out.println("7) Validar nota 0..10 (do-while)");
        System.out.println("8) Precio final con impuesto y descuento");
        System.out.println("9) Envío y total de compra");
        System.out.println("10) Actualización de stock");
        System.out.println("11) Descuento especial (global 10%)");
        System.out.println("12) Array de precios (modificar uno)");
        System.out.println("13) Impresión recursiva de array");
        System.out.println("0) Salir");
        System.out.print("Elegí una opción: ");
    }

    // 1) Año bisiesto
    static void punto1_anioBisiesto() {
        System.out.println("\n— Año bisiesto —");
        System.out.print("Año: ");
        int anio = in.nextInt();

        boolean esBisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
        if (esBisiesto) {
            System.out.println("El año " + anio + " es bisiesto.");
        } else {
            System.out.println("El año " + anio + " no es bisiesto.");
        }
    }

    // 2) Mayor de tres números
    static void punto2_mayorDeTres() {
        System.out.println("\n— Mayor de tres —");
        System.out.print("N1: ");
        int a = in.nextInt();
        System.out.print("N2: ");
        int b = in.nextInt();
        System.out.print("N3: ");
        int c = in.nextInt();

        int mayor = a;
        if (b > mayor) mayor = b;
        if (c > mayor) mayor = c;

        System.out.println("Mayor: " + mayor);
    }

    // 3) Clasificación de edad
    static void punto3_clasificarEdad() {
        System.out.println("\n— Clasificar edad —");
        System.out.print("Edad: ");
        int edad = in.nextInt();

        String etapa;
        if (edad < 12) etapa = "Niño";
        else if (edad <= 17) etapa = "Adolescente";
        else if (edad <= 59) etapa = "Adulto";
        else etapa = "Adulto mayor";

        System.out.println("Sos: " + etapa);
    }

    // 4) Descuento por categoría
    static void punto4_descuentoCategoria() {
        System.out.println("\n— Descuento por categoría —");
        System.out.print("Precio: ");
        double precio = in.nextDouble();
        System.out.print("Categoría (A/B/C): ");
        String cat = in.next().toUpperCase();

        double desc = 0;
        if (cat.equals("A")) desc = 0.10;
        else if (cat.equals("B")) desc = 0.15;
        else if (cat.equals("C")) desc = 0.20;
        else System.out.println("Categoría inválida (se aplica 0%).");

        double precioFinal = precio - (precio * desc);

        System.out.println("Descuento: " + (desc * 100) + "%");
        System.out.println("Precio final: " + precioFinal);
    }

    // 5) Suma de pares (while)
    static void punto5_sumaPares() {
        System.out.println("\n— Suma de pares (0 para terminar) —");
        int suma = 0;
        int n;

        do {
            System.out.print("Número: ");
            n = in.nextInt();
            if (n != 0 && n % 2 == 0) {
                suma += n;
            }
        } while (n != 0);

        System.out.println("Suma de pares: " + suma);
    }

    // 6) Contador de positivos, negativos y ceros (for)
    static void punto6_contarPosNegCeros() {
        System.out.println("\n— Contador de 10 números —");
        int pos = 0, neg = 0, cer = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("N° " + i + ": ");
            int x = in.nextInt();
            if (x > 0) pos++;
            else if (x < 0) neg++;
            else cer++;
        }

        System.out.println("Positivos: " + pos);
        System.out.println("Negativos: " + neg);
        System.out.println("Ceros: " + cer);
    }

    // 7) Validación de nota 0..10 (do-while)
    static void punto7_validarNota() {
        System.out.println("\n— Validar nota (0-10) —");
        int nota;

        do {
            System.out.print("Nota: ");
            nota = in.nextInt();
            if (nota < 0 || nota > 10) {
                System.out.println("Error: fuera de rango.");
            }
        } while (nota < 0 || nota > 10);

        System.out.println("Nota guardada.");
    }

    // 8) Precio final con impuesto y descuento
    static void punto8_precioFinal() {
        System.out.println("\n— Precio final —");
        System.out.print("Precio base: ");
        double base = in.nextDouble();
        System.out.print("Impuesto % (ej: 10): ");
        double imp = in.nextDouble();
        System.out.print("Descuento % (ej: 5): ");
        double desc = in.nextDouble();

        double impuesto = base * (imp / 100.0);
        double descuento = base * (desc / 100.0);
        double total = base + impuesto - descuento;

        System.out.println("Total: " + total);
    }

    // 9) Costo de envío y total de compra
    static void punto9_envioYTotal() {
        System.out.println("\n— Envío y total —");
        System.out.print("Precio producto: ");
        double precio = in.nextDouble();
        System.out.print("Peso (kg): ");
        double kg = in.nextDouble();
        in.nextLine(); // limpia el salto de línea
        System.out.print("Zona (Nacional/Internacional): ");
        String zona = in.nextLine();

        double costoEnvio;
        if (zona.equalsIgnoreCase("Nacional")) {
            costoEnvio = kg * 5;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            costoEnvio = kg * 10;
        } else {
            System.out.println("Zona no válida. Se toma Nacional.");
            costoEnvio = kg * 5;
        }

        double total = precio + costoEnvio;
        System.out.println("Costo de envío: " + costoEnvio);
        System.out.println("Total a pagar: " + total);
    }

    // 10) Actualización de stock
    static void punto10_actualizarStock() {
        System.out.println("\n— Actualizar stock —");
        System.out.print("Stock actual: ");
        int stock = in.nextInt();
        System.out.print("Cantidad vendida: ");
        int vendida = in.nextInt();
        System.out.print("Cantidad recibida: ");
        int recibida = in.nextInt();

        int nuevoStock = stock - vendida + recibida;
        System.out.println("Nuevo stock: " + nuevoStock);
    }

    // 11) Descuento especial (usa variable global)
    static void punto11_descuentoEspecial() {
        System.out.println("\n— Descuento especial 10% —");
        System.out.print("Precio: ");
        double precio = in.nextDouble();

        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
        double precioFinal = precio - descuentoAplicado;

        System.out.println("Descuento aplicado: " + descuentoAplicado);
        System.out.println("Precio final: " + precioFinal);
    }

    // 12) Modificar un array de precios
    static void punto12_modificarArray() {
        System.out.println("\n— Array de precios —");
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        System.out.println("Originales:");
        for (double p : precios) {
            System.out.println("Precio: $" + p);
        }

        // modificar el 3er elemento (índice 2)
        precios[2] = 129.99;

        System.out.println("Modificados:");
        for (double p : precios) {
            System.out.println("Precio: $" + p);
        }
    }

    // 13) Impresión recursiva de array
    static void punto13_imprimirRecursivo() {
        System.out.println("\n— Recursivo array —");
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        System.out.println("Originales:");
        imprimirRec(precios, 0);

        precios[2] = 129.99;

        System.out.println("Modificados:");
        imprimirRec(precios, 0);
    }

    static void imprimirRec(double[] arr, int i) {
        if (i >= arr.length) return;           // caso base
        System.out.println("Precio: $" + arr[i]);
        imprimirRec(arr, i + 1);               // recursividad
    }
}
