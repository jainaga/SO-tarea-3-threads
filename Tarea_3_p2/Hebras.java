package Tarea_3_p2;




public class Hebras extends Thread {
    static int mayor_abs = 1;
    final private int limite_inferior;
    final private int limite_superior;


    public Hebras (int inferior, int superior){
        this.limite_inferior = inferior;
        this.limite_superior = superior;
    }

    public void run(){
        int mayor = 0;
        int cant_mayor = 0;
        for (int i = limite_inferior; i <= limite_superior; i++){
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

        if (mayor >= mayor_abs){
            mayor_abs = mayor;
        }

    }

    public int get_mayor(){
        return mayor_abs;
    }


	
	

	

}