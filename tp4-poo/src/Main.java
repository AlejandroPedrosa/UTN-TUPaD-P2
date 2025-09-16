/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dev-alejandropedrosa
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final List<Empleado> empleados = new ArrayList<>();

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = leerEntero("Elegí una opción: ");
            System.out.println();
            switch (opcion) {
                case 1 -> crearEmpleadoCompleto();
                case 2 -> crearEmpleadoBasico();
                case 3 -> listarEmpleados();
                case 4 -> actualizarSalarioPorcentaje();
                case 5 -> actualizarSalarioMontoFijo();
                case 6 -> mostrarTotal();
                case 0 -> System.out.println("Saliendo... ¡Éxitos con la entrega!");
                default -> System.out.println("Opción inválida. Probá de nuevo.");
            }
            System.out.println();
        } while (opcion != 0);
    }

    private static void mostrarMenu() {
        System.out.println("===== Gestión de Empleados (TP4 - Programacion Orientada a Objetos) =====");
        System.out.println("1. Crear empleado completo");
        System.out.println("2. Crear empleado básico (solo nombre y puesto)");
        System.out.println("3. Listar empleados");
        System.out.println("4. Actualizar salario por porcentaje");
        System.out.println("5. Actualizar salario por monto fijo");
        System.out.println("6. Mostrar total de empleados");
        System.out.println("0. Salir");
    }

    private static void crearEmpleadoCompleto() {
        int id = leerEntero("ID: ");
        String nombre = leerTexto("Nombre: ");
        String puesto = leerTexto("Puesto: ");
        double salario = leerDouble("Salario: ");

        Empleado e = new Empleado(id, nombre, puesto, salario);
        empleados.add(e);
        System.out.println("Empleado creado correctamente: " + e);
    }

    private static void crearEmpleadoBasico() {
        String nombre = leerTexto("Nombre: ");
        String puesto = leerTexto("Puesto: ");

        Empleado e = new Empleado(nombre, puesto);
        empleados.add(e);
        System.out.println("Empleado básico creado correctamente: " + e);
        System.out.println("   * Salario por defecto: " + String.format("%.2f", Empleado.SALARIO_POR_DEFECTO));
    }

    private static void listarEmpleados() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados cargados.");
            return;
        }
        System.out.println("=== Lista de empleados ===");
        empleados.forEach(System.out::println);
    }

    private static void actualizarSalarioPorcentaje() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados cargados.");
            return;
        }
        int id = leerEntero("ID del empleado: ");
        Optional<Empleado> opt = buscarPorId(id);
        if (opt.isEmpty()) {
            System.out.println("No se encontró el empleado con ID " + id);
            return;
        }
        double porcentaje = leerDouble("Porcentaje a aumentar (ej: 10 para +10%): ");
        Empleado e = opt.get();
        e.actualizarSalario(porcentaje);
        System.out.println("Nuevo salario establecido: " + e);
    }

    private static void actualizarSalarioMontoFijo() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados cargados.");
            return;
        }
        int id = leerEntero("ID del empleado: ");
        Optional<Empleado> opt = buscarPorId(id);
        if (opt.isEmpty()) {
            System.out.println("No se encontró el empleado con ID " + id);
            return;
        }
        int monto = leerEntero("Monto fijo a aumentar: ");
        Empleado e = opt.get();
        e.actualizarSalario(monto); // sobrecarga por tipo (int)
        System.out.println("Nuevo salario establecido: " + e);
    }

    private static void mostrarTotal() {
        System.out.println("Total de empleados creados: " + Empleado.mostrarTotalEmpleados());
    }

    // ---- Utils ----
    private static Optional<Empleado> buscarPorId(int id) {
        return empleados.stream().filter(e -> e.getId() == id).findFirst();
    }

    private static String leerTexto(String prompt) {
        System.out.print(prompt);
        String s = scanner.nextLine();
        while (s.trim().isEmpty()) {
            System.out.print("No puede estar vacío. " + prompt);
            s = scanner.nextLine();
        }
        return s.trim();
    }

    private static int leerEntero(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                String line = scanner.nextLine();
                return Integer.parseInt(line.trim());
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido. Ingresá un número entero.");
            }
        }
    }

    private static double leerDouble(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                String line = scanner.nextLine();
                return Double.parseDouble(line.trim().replace(",", "."));
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido. Ingresá un número (usa punto o coma).");
            }
        }
    }
}

