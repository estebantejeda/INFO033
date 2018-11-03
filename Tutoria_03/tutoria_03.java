//Importar Librerias

import java.util.*;

//Crear clase Main

public class tutoria_03{
  public static void main (String args[]){
    
//Definir Variables
    
    int x;
    
//Crear Objetos
    
    Scanner teclado = new Scanner(System.in);
    Howarts harry = new Howarts();
    
//Pedir datos a Usuario
    
    System.out.println("Ingrese la cantidad de casas que quiere [1, 4]:");
    harry.setCas(teclado.nextInt());
    harry.nombreCasas();
    harry.animalCasas();
    harry.alumCasa();
    harry.profCasa();
  }
}