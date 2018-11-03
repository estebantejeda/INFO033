//Importar Librerias a Java

import java.util.*;

//Crear Clase Jugador

class Jugador{
  
//Crear Atributos de la Clase
  
  int numero;
  
//Crear Metodos
  
  //Metodo adivinar
  
  public void adivinar(){
    Random aleat = new Random();
    numero = aleat.nextInt(10)+1;
  }
  
}