package Tarea_3_p1;

import java.util.Scanner;


public class tarea {
    public static void main(String [] args) {
        System.out.println("Ingrese el número para fijar el rango de búsqueda");
        Scanner numero = new Scanner(System.in);
        int n = numero.nextInt();
        numero.close();
        int valor = Funcion.encontrar_numero(n);
        System.out.println(valor);

    }


}
