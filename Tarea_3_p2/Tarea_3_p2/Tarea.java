package Tarea_3_p2;

import java.util.Scanner;


public class Tarea {
    public static void main(String [] args) {                   //se pide el numero que define el rango en el cual se hará la búsqueda
        System.out.println("Ingrese el número para fijar el rango de búsqueda");
        Scanner numero = new Scanner(System.in);
        int n = numero.nextInt();
        numero.close();
        final long startTime = System.nanoTime();

        int numero_hebras = 16;                                 //se define el número de hebras que se ocuparan en el desarrollo 
        int inicio = 1, tope= n/numero_hebras;

        

        
        Hebras partes[] = new Hebras[numero_hebras];            //se crea un arreglo de n hebras, siendo hebras la clase implementada en el archivo Hebras.java
        for (int i = 0; i < numero_hebras; i++) {
            partes[i] = new Hebras(inicio, tope);               //se crean las hebras definienfo sus propios rangos de trabajo
            partes[i].start();                                  //se inician las hebras y empiezan con su trabajo
            inicio = tope + 1;
            tope = tope + n/numero_hebras;
        }

        


        try {
            for (int i = 0; i < numero_hebras; i++) {           //se unen las hebras 
                partes[i].join();
            }
            

            
        } catch (Exception e) {
            System.out.println("Las hebras tuvieron dificultades, se pudieron realizar el calculo");
        }
  


        int resultado = ((Hebras) partes[0]).get_mayor();       //se usa el método get_mayor de Hebras para obtener el numero con mayor divisores

        System.out.println(resultado);





        final long endTime = System.nanoTime();
		long totalTime = endTime - startTime;                   //se calcula el timepo total de las hebras
        //System.out.println(valor);
        System.out.println("El tiempo que toma en ejecutarse el programa en segundos es de: " + totalTime/1000000000f + " segundos.");

        

    }


}