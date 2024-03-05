package co.com.ps.TrabajosEnClase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TrabajoEnClase5 {

    //Crear un programa que filtre las palabras que tengan mas de 5 caracteres
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> listaPalabras = Arrays.asList("Java", "Stream", "Ejemplo", "Programación", "Funcional");
        List<String> listaFiltrada = new ArrayList<>();

        for (String palabra : listaPalabras) {
            if (palabra.length() > 5) {
                listaFiltrada.add(palabra);
                System.out.println(palabra);
            }
        }

    }
    }

