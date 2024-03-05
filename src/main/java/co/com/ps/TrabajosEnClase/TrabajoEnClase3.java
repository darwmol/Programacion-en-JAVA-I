//Crear un ingreso universitario. Listas.
//Debe solitar 3 nombre de estudiantes y debe guardarse en una estructura de datos, llamese arreglo o lista
// al final debe imprimir el nombre de los estudiantes


package co.com.ps.TrabajosEnClase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TrabajoEnClase3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("INGRESO UNIVERSITARIO.");
        System.out.println("Por favor ingrese el nombre del primer estudiante:");
        String nombre1 = scanner.next();
        System.out.println("Por favor ingrese el nombre del segundo estudiante:");
        String nombre2 = scanner.next();
        System.out.println("Por favor ingrese el nombre del tercer estudiante:");
        String nombre3 = scanner.next();
        System.out.println("_____________________________________");
        System.out.println("Los datos ingresados son: ");

        String[] nombres= new String[3];
        int[] numeros = {1,2};
        nombres[0]= nombre1;
        nombres[1]= nombre2;
        nombres[2]= nombre3;
        Arrays.stream(nombres).forEach(System.out::println);
        System.out.println("El número de estudiantes que se registraron es: " + nombres.length );

        scanner.close();
    }
}


