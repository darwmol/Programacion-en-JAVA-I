package co.com.ps.TrabajosEnClase;

import java.util.Scanner;

public class TrabajoEnClase1 {
    public static void main(String[] args) {
// Trabajo en clase 1: Calcula el promedio de 3 datos.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor ingrese su nombre:");
        String nombre = scanner.next();
        System.out.println("Bienvenido " + nombre);
        System.out.println("Por favor ingrese el primer número:");
        int num1 = scanner.nextInt();
        System.out.println("Por favor ingrese el segundo número:");
        int num2 = scanner.nextInt();
        System.out.println("Por favor ingrese el tercer número:");
        int num3 = scanner.nextInt();
        int prom = (num1+num2+num3)/3;
        System.out.println(nombre + ","+"el promedio de los tres numeros que ingresaste es: " + prom);
        scanner.close();
    }
}
