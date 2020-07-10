Francisco Reyes Jainaga

Rol: 201773529-5

Instrucciones para el uso de la tarea:
1.- Se necesita tener JDK 8 u 11 (la tarea fue realizada con JDK 11)

2.- Dentro de la tarea debería encontrar: README.txt, Tarea_3_p1, Tarea_3_p2.
    Tarea_3_p1 debería tener: Tarea_3_p1 y makefile;  Tarea_3_p1: tarea.java y Funcion.java
    Tarea_3_p2 debería tener: Tarea_3_p2 y makefile;  Tarea_3_p2: Tarea.java y Hebras.java

3.- Para ejecutar cada parte de la tarea, acceder a las carpetas donde se encuentran los makefiles correspondientes.

4.- Una vez se esta en una terminal situada en la carpeta correcta, use los siguientes comandos:
    
    make : este compilara los archivos necesarios para ejecutar la parte de la tarea.

    make run : se ejecutará el código.

    make clean : se eliminaran las compilaciones hechas con make. 



Consideraciones:

-En el código que utiliza hebras, se puede cambiar el número de hebras a usar en la variable numero_hebras.

-El análisis de los tiempos fue hecho con 16 hebras, ya que se consideró un número apropiado, según las hebras del computador en que se desarrolló.

-Se utilizó la clase Thread de Java para implementar las hebras.

-La raz+on de usar 16 hebras, es porque el computador con el que se desarrolló tiene 8 hebras en procesador, y la ventaja de usar 16 hebras respecto 
 a 8, 32, etc. era el número que mostraba el mejor rendimiento, la creación de esas 16 hebras tenía un costo menor que el hacer trabajar 8 hebras más
  o crear más hebras con menos tareas cada una.

Respuestas:

1.- Con la utilización de 16 hebras, el número en el cual aparecen menores tiempos en la utilización de hebras es entre 7000-8000, 
    varía bastante poco en ese rango, por lo que es incierto decir cual método es mejor en esos rangos, mejor a eso es mejor usar el método
    sin hebras, y para valores mayores al rango es más rápido usar el método con hebras, y los tiempos se reducen considerablemente.

2.- Esto se debe a que en los número menores al rango especificado, el proceso de crear la hebras y manipilarlas es más costoso que 
    el calcular de manera secuencial los números, pero una vez llegamos al rango, los costos de manipular las hebras son bastante similares 
    a los costos de calculos secuencial, y para números mayores al rango, el crear la hebras y que cada una de ellas utilice una parte del 
    intervalo pedido, es más rápido y eficiente que se haga secuencial, y es notoria la disminución de los tiempos usando hebras. Y la diferencia 
    entre usar ciertas cantidades de hebras se nota una vez se alcanzan la hebras que usa la máquina, por ejemplo 8 hebras son mucho más eficientes
    que dos hebras y como 16 son dos grupos de ocho, es similar pero aún así mostró mejor desempeño el uso de 16, pero si pasamos a 32, que son 2 grupos 
    de 16 baja el desempeño porque el coste de hacer más hebras es más alto que darle más tareas a cada hebra.