package Tarea_3_p2;

import java.util.Scanner;


public class Tarea {
    public static void main(String [] args) {
        System.out.println("Ingrese el número para fijar el rango de búsqueda");
        Scanner numero = new Scanner(System.in);
        int n = numero.nextInt();
        numero.close();
        final long startTime = System.nanoTime();

        int numero_hebras = 16;
        int inicio = 1, tope= n/numero_hebras;

        

        
        Hebras partes[] = new Hebras[numero_hebras];
        for (int i = 0; i < numero_hebras; i++) {
            partes[i] = new Hebras(inicio, tope);
            partes[i].start();
            inicio = tope + 1;
            tope = tope + n/numero_hebras;
        }

        


        try {
            for (int i = 0; i < numero_hebras; i++) {
                partes[i].join();
            }
            

            
        } catch (Exception e) {
            //TODO: handle exception
        }
  


        int resultado = ((Hebras) partes[0]).get_mayor();

        System.out.println(resultado);





        final long endTime = System.nanoTime();
		long totalTime = endTime - startTime;
        //System.out.println(valor);
        System.out.println("El tiempo que toma en ejecutarse el programa en segundos es de: " + totalTime/1000000000f + " segundos.");

        

    }


}