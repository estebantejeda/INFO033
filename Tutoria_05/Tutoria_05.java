//Importar Librerias

import java.util.*;

//Crear Clase Main

public class Tutoria_05{
  public static void main (String args[]){
    
//Declarar Variables
    
    int a;
    int x;
    boolean ciclico;
    boolean b;
    
    //Arreglos de Objetos
    
    Carnes carne[] = new Carnes[3];
    Pan panes[] = new Pan[3];
    
//Designar Variales
    
    ciclico = true; 
    
//Crear Objetos
    
    Scanner teclado = new Scanner(System.in);
    for(int i = 0; i < 3; i++){
      carne[i] = new Carnes();
      panes[i] = new Pan();
    }
    
//Explicacion de algoritmo al usuario
    
    System.out.println("\t%%%BIENVENIDO A HIPERMERCADO%%%");
    System.out.println("\nCONTROL DE VENTAS DE PRODUCTOS");
    System.out.println("\nSELECCIONE UNA OPCION:");
    
//Desplegar Menu
    
    System.out.println("1.- VENTA");
    System.out.println("2.- VER PRODUCTO");
    System.out.println("3.- INGRESAR NUEVO PRODUCTO");
    System.out.println("4.- SALIR");
    
//Pedir Respuesta al Usuario
    
    while(ciclico){
      x = validaRespuesta("\nIngresar alternativa");
      
//Desplegar Seleccion de Opciones
      
      switch(x){
        case 1:
          System.out.println("Ingrese el codigo del producto:");
          a = teclado.nextInt();
          b = buscaExistencia(a);
          break;
        case 2:
          
          break;
        case 3:
          
          break;
        case 4:
          ciclico = false;
          System.out.println("Gracias Por Preferirnos");
          break;
      }
    }
    
  }
  
//Crear Metodos
  
  //Metodo validaRespuesta
  
  public static int validaRespuesta(String msj){
    Scanner t = new Scanner(System.in);
    System.out.println(msj);
    int x = t.nextInt();
    while(x < 1 || x > 4){
      System.out.println("Error, alternativa no valida");
      System.out.println(msj);
      x = t.nextInt();
    }
    return x;
  }
  
  //Metodo buscaExistencia
  
  public static boolean buscaExistencia(int codigo){
    for (int i = 0; i < 3; i++){
      if(carne[i].getCodigo() == codigo){
        System.out.println("Producto encontrado");
      }
      else if(panes[i].getCodigo == codigo){
        System.out.println("Producto encontrado");
      }
      else{
        System.out.println("Producto Inexistente");
      }
    }
  }
  
}