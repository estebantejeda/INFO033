//Importar Librerias a Java

import java.util.*;

//Crear Clase Main

class ejercicio_09{
  public static void main (String args[]){
    
//Crear Objetos
    
    Vendedor ps3 = new Vendedor();
    Scanner teclado = new Scanner(System.in);
    
//Declarar Variables
    
    int x;
    
//Definir Objetos

    //Obtejo ps3 de clase Vendedor
    
    ps3.setCodigo(50);
    ps3.setStock(30);
    
//Realizar Acciones 
    
    System.out.println("Ingrese la cantidad que desea comprar");
    x = teclado.nextInt();
    ps3.venta(x);
  }

}