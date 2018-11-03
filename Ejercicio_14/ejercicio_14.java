//Improtar Librerias

import java.util.*;

//Crear Clase Main

public class ejercicio_14{
  public static void main (String args[]){
    
//Crear Objetos    
    
    Numeros num[] = new Numeros[7];
    Random aleat = new Random();
    
//Llenar Arreglo con Numeros Aleatorios e Imprimir en Pantalla
    
    for (int i = 0; i < 6; i++){
      num[i] = new Numeros();
      num[i].valor = aleat.nextInt(50);
      System.out.print(num[i].valor+" - ");
    }
    num[6] = new Numeros();
    num[6].valor = aleat.nextInt(50);
    System.out.println(num[6].valor);
  }
  
}