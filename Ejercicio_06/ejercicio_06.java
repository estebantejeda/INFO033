//Importar Librerias a Java

import java.util.*;

//Crear Clase Main

public class ejercicio_06{
  public static void main (String args[]){
    
//Crear Objetos
    
    Scanner teclado = new Scanner(System.in);
    Personaje player[] = new Personaje[3];
    
//Declarar Variables
    
    int x, y;
    
//Explicacion al Usuario de Algoritmo
    
    System.out.println("\n*****Crendo Personajes*****\n");
    
//Designar Atributos a Objeto Player
    
    for (int i = 0; i < 3; i++){
      player[i] = new Personaje();
      player[i].setNombre("PJ #".concat(Integer.toString(i+1)));
      player[i].setVida();
      player[i].setMagia();
      player[i].setFuerza();
      player[i].setResistencia();
      player[i].equilibraStats();
    }
    
//Imprimir Personajes en Pantalla
    
    for (int i = 0; i < 3; i++){
      player[i].imprimeStats();
      System.out.println("");
    }
    System.out.println("***************************");
    
//Pedir al Usuario la Eleccion de un Personaje Desplegando un Menu
    
    x = validaOpcion("\nElige tu Personaje: ", 1, 3);
     System.out.println("\n*****Crendo Clases*****\n");
    despliegaClase();
    System.out.println("\n***************************");
    y = validaOpcion("\nElige una Clase: ", 1, 2);
    
  }
  
//Realizar Metodos
  
  //Metodo validaOpcion
  
  public static int validaOpcion(String msj, int min, int max){
    System.out.println(msj);
    Scanner t = new Scanner(System.in);
    int opc = t.nextInt();
    while (opc < min || opc > max){
      System.out.println("Error!, la variable ingresada no esta dentro del rango ["+min+", "+max+"]");
      System.out.println(msj);
      opc = t.nextInt();
    }
    return opc;
  }
  
  //Metodo DespliegaClase
  
  public static void despliegaClase(){
    System.out.println("1.- Guerrero");
    System.out.println("2.- Mago");
  }
  
}