//Importar Librerias a Java

import java.util.*;

//Crear Clase Main

public class desafio_01{
  public static void main (String args[]){
    
//Crear Objetos
    
    Scanner teclado = new Scanner(System.in);
    TiendaVideo tienda = new TiendaVideo();
    
//Declarar Variables
    
    String x;
    int a;
    boolean ciclico = true;
    
//Explicacion de Algoritmo al usuario
    
    System.out.println("Algoritmo que permite Agregar, Arrendar o Devolver peliculas a un VideoClub.\n");
    
//Desplegar Opciones al Usuario
    
    System.out.println("Selecciona una Opcion:\n");
    System.out.println("1) Mostrar Peliculas");
    System.out.println("2) Agregar Pelicula");
    System.out.println("3) Arrendar Pelicula");
    System.out.println("4) Devolver Pelicula");
    System.out.println("5) Salir");
    
//Crear Ciclico
    
    while (ciclico){
      
//Pedir Alternativa al Usuario
      
      a = validarAlternativa("\nIngrese una Opcion:");
      
//Desplegar Menu 
      
      switch (a){
        case 1:
          tienda.mostrarVideos();
          break;
        case 2:
          System.out.println("\nSeleccione el Titulo de la Pelicula que desea Agregar:");
          tienda.agregarVideo(teclado.nextLine());
          break;
        case 3:
          System.out.println("\nSeleccione el Titulo de la Pelicula que desea Arrendar:");
          tienda.arrendarVideo(teclado.nextLine());
          break;
        case 4:
          System.out.println("\nSeleccione el Titulo de la Pelicula que desea Devolver:");
          tienda.devolverVideo(teclado.nextLine());
          break;
        case 5:
          ciclico = false;
          break;
      }
    }
  }
  
//Realizar Metodos
  
  public static int validarAlternativa(String text){
    Scanner t = new Scanner(System.in);
    System.out.println(text);
    int alt = t.nextInt();
    while (alt < 1 || alt > 5){
      System.out.println("Error!, la alternativa ingresada no es valida");
      System.out.println("\n"+text);
      alt = t.nextInt();
    }
    return alt;
  }
  
}