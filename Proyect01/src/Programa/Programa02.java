
package Programa;

import java.util.Scanner;

public class Programa02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar los datos del empleado
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese las horas trabajadas: ");
        double horasTrabajadas = scanner.nextDouble();

        System.out.print("Ingrese la tarifa por hora: ");
        double tarifaPorHora = scanner.nextDouble();

        // Calcular sueldo bruto
        double sueldoBruto = horasTrabajadas * tarifaPorHora;

        // Calcular descuento ONP (13%)
        double descuentoONP = sueldoBruto * 0.13;

        // Calcular sueldo neto
        double sueldoNeto = sueldoBruto - descuentoONP;

        // Mostrar resultados
        System.out.println("\n--- Boleta de Pago ---");
        System.out.println("Empleado: " + nombre);
        System.out.printf("Sueldo Bruto: S/ %.2f\n", sueldoBruto);
        System.out.printf("Descuento ONP (13%%): S/ %.2f\n", descuentoONP);
        System.out.printf("Sueldo Neto: S/ %.2f\n", sueldoNeto);

        scanner.close();
    }
}