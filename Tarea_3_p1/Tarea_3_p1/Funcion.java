package Tarea_3_p1;

public class Funcion {

    public static int encontrar_numero(int numero){     //calculo del número en el rango con la mayor cantidad de divisores
        int mayor = 0;
        int cant_mayor = 0;
        for (int i = 1; i <= numero; i++){
            int cant = 0;
            for (int j = 1; j <= i; j++){
                if (i%j == 0){
                    cant++;
                }
            }
            if (cant > cant_mayor){
                cant_mayor = cant;
                mayor = i;
            }
        }
        return mayor;           //se retorna el mayor encontrado 
    }
}