//Importar Librerias a Java

import java.util.*;

//Crear clase Main

public class Restoran{
  public static void main(String args[]){
    
//Declarar Variables
    
    String a = "";
    int b = 0;
    int c = 0;
    int d = 0;
    
//Crear Objetos    
    
    Mesa mesas[] = new Mesa[12];
    Random aleat = new Random();
    
//Definir variables a Objetos
    
    for (int i = 0; i < 12; i++){
      a = Integer.toString(i+1);
      mesas[i] = new Mesa();
      mesas[i].setOcupada(true);
      mesas[i].setCodigo("M".concat(a));
      b = aleat.nextInt(5)+2;
      mesas[i].setCapacidad(b);
      System.out.println("La mesa: "+mesas[i].getCodigo()+" tiene una capacidad de: "+mesas[i].getCapacidad()+" personas.");
    }
    
//Desplegar Capacidad mesas no ocupadas

    for (int i = 0; i < 12; i++){
      if (mesas[i].getOcupada() == true){
        c = c + mesas[i].getCapacidad();        
      }
    }
    System.out.println("\nCapacidad total de mesas no ocupadas: "+c+".\n");
    
//Desplegar Mesas desocupadas
    
    System.out.println("Mesas Ocupadas: \n");
    for(int i = 0; i < 12; i++){
      if (mesas[i].getOcupada() == false){
        System.out.println("Mesa "+mesas[i].getCodigo());
        d++;
      }
    }
    if (d == 0){
      System.out.println("***TODAS LAS MESAS ESTAN DESOCUPADAS***");
    } 
  }
  
}