//Importar librerias a Java

import java.util.*;

//Crear clase Main

public class ejercicio_07{
  public static void main (String args[]){
    
//Crear Objetos
    
    Scanner teclado = new Scanner(System.in);
    CajaAhorro cuenta1 = new CajaAhorro();
    
//Declarar Variables
    
    int x, y, z;
    boolean ciclico;
    
//Explicacion de Algoritmo a Usuario
    
    System.out.println("Bienvenido al asistente de Banco.");
    System.out.println("\nCosto por Giro: $" + cuenta1.cg + ".");
    System.out.println("Costo por Ver Estado de Cuenta: $" + cuenta1.cs + ".\n");
    
//Realizar ciclico
    
    ciclico = true;
    while (ciclico){    
      
//Explicacion de Menu de Usuario
      
      System.out.println("Ingrese la opcion que desea realizar:\n");
      System.out.println("1) Realizar Deposito");
      System.out.println("2) Realizar Giro");
      System.out.println("3) Ver Estado de Duenta");
      System.out.println("4) Salir");
      x = ingresaOpcion();
      
//Desplegar Menu
      
      switch (x){
        case 1:
          y = validaDinero("\nIngrese la cantidad de dinero que desea depositar");
          cuenta1.depositar(y);
          System.out.println("Deposito realizado con Exito!\n");
          break;
        case 2:
          z = validaDinero("\nIngrese la cantidad de dinero que desea retirar");
          cuenta1.girar(z);
          System.out.println("Giro realizado con Exito!.\n");
          break;
        case 3:
          cuenta1.obtenerSaldo();
          cuenta1.obtenerTransacciones();
          System.out.println("");
          break;
        case 4:
          ciclico = false;
          System.out.println("Gracias!");
      }
    }
  }
  
//Realizar Metodos
  
  //Metodo despliegaOpcion
  
  public static int ingresaOpcion(){
    Scanner teclado = new Scanner(System.in);
    System.out.println("\nIngresa tu opcion:");
    int opcion = teclado.nextInt();
    while (opcion > 4 || opcion < 1){
      System.out.println("Error!, la opcion ingresada no es valida.");
      System.out.println("\nIngresa tu opcion nuevamente");
      opcion = teclado.nextInt();
    }
    return opcion;
  }
  
  //Metodo validaDinero
  
  public static int validaDinero(String mensaje){
    Scanner teclado = new Scanner(System.in);
    System.out.println(mensaje);
    int dinero = teclado.nextInt();
    while (dinero < 0){
      System.out.println("Error, el monto ingresado no es valido");
      System.out.println(mensaje);
      dinero = teclado.nextInt();
    }
    return dinero;
  }
  
}