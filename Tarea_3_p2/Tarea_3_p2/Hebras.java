package Tarea_3_p2;




public class Hebras extends Thread {
    static int mayor_abs = 1;           //se declaran los atributos de las hebras
    final private int limite_inferior;
    final private int limite_superior;


    public Hebras (int inferior, int superior){     //constructor de las hebras
        this.limite_inferior = inferior;
        this.limite_superior = superior;
    }

    public void run(){                              //tarea a ejecutar de las hebras al iniciarlas
        int mayor = 0;
        int cant_mayor = 0;
        for (int i = limite_inferior; i <= limite_superior; i++){   //calculo del número en el rango con la mayor cantidad de divisores
            int cant = 0;
            for (int j = 1; j <= i; j++){
                if (i%j == 0){
                    cant++;
                }
            }
            if (cant >= cant_mayor){
                cant_mayor = cant;
                mayor = i;
            }
        }

        if (mayor >= mayor_abs){        //se asigna el mayor local a mayor global si es mayor igual a este
            mayor_abs = mayor;
        }

    }

    public int get_mayor(){         //método para obtener el mayor_glonal
        return mayor_abs;
    }


	
	

	

}