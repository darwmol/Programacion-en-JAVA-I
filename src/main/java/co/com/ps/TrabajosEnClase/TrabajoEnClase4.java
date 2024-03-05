/*1 Detectar si un numero es positivo negativo o 0

1) Crea un programa que solicite al usuario ingresar el precio de un artículo y
su categoría (por ejemplo, "electrónicos", "ropa", "alimentos").
Aplica un descuento del 10% si es electrónica, 5% si es ropa y 2%
si son alimentos. Imprime el precio final.
*/

package co.com.ps.TrabajosEnClase;

import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

public class TrabajoEnClase4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("EJERCICIO 1.NÚMERO POSITIVO O NEGATIVO");
        System.out.println("Por favor ingrese un número :");
        int num = Integer.parseInt(scanner.next());

        if(num >= 0){
            System.out.println("El número: " + num + " es un número POSITIVO");
        }else{
            System.out.println("El número: " + num + " es un número NEGATIVO");
        }

        System.out.println("EJERCICIO 2. PORCENTAJE DE UN ARTICULO");
        System.out.println("Por favor ingrese el precio del artículo");
        int price = Integer.parseInt(scanner.next());
        System.out.println("Por favor seleccione la categoría:");
        System.out.println("1. Electrónico.");
        System.out.println("2. Ropa.");
        System.out.println("3. Alimentos.");
        int cat = Integer.parseInt(scanner.next());

        switch (cat){
            case 1:
                price = price - ((10 * price)/100);
                System.out.println("El precio del artículo con un descuento del 10% es: " + price);
                break;
            case 2:
                price = price - ((5 * price)/100);
                System.out.println("El precio del artículo con un descuento del 5% es: " + price);
                break;
            case 3:
                price = price - ((2 * price)/100);
                System.out.println("El precio del artículo con un descuento del 2% es: " + price);
                break;
            default:
                System.out.println("La opción es incorrecta. Intente de nuevo.");
                break;
        };
        scanner.close();
    }
}


