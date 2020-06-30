package Tarea_3_p1;

import java.util.Scanner;


public class tarea {
    public static void main(String [] args) {
        System.out.println("Ingrese el número para fijar el rango de búsqueda");
        Scanner numero = new Scanner(System.in);
        int n = numero.nextInt();
        numero.close();
        final long startTime = System.nanoTime();
        int valor = Funcion.encontrar_numero(n);
        final long endTime = System.nanoTime();
		long totalTime = endTime - startTime;
        System.out.println(valor);
        System.out.println("El tiempo que toma en ejecutarse el programa en segundos es de: " + totalTime/1000000000f + " segundos.");

    }


}
