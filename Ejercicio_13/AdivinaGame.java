//Importar Librerias a Java

import java.util.*;

//Crear Clase AdivinaGame

class AdivinaGame{
  
//Crear Objetos
  
  Jugador pj1 = new Jugador();
  Jugador pj2 = new Jugador();
  Jugador pj3 = new Jugador();
  
//Crear Metodos
  
  //Metodo iniciaJuego
  
  public void iniciaJuego(){
    pj1.adivinar();
    pj2.adivinar();
    pj3.adivinar();
  }
  
}