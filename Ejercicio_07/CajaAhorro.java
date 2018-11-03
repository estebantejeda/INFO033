//Importar Librerias a Java

import java.util.*;

//Crear Clase CajaAhorro

class CajaAhorro{
  
//Definir Atributos a la Clase
  
  private int saldo;
  private int transacciones;
  protected int cg = 300;
  protected int cs = 100;
  
//Realizar Metodos
  
  //Metodo CajaAhorro
  
  public CajaAhorro(){
    saldo = 0;
    transacciones = 0;
  }
  
  //Metodo depositar
  
  public void depositar(int monto){
    saldo = saldo + monto;
    transacciones++;
  }
  
  //Metodo girar
  
  public void girar(int monto){
    if (saldo - monto - cg < 0){
      System.out.println("Error, no dispone del dinero suficiente en su cuenta para realizar la operacion.");
    }
    else{
      saldo = saldo - monto - cg;
      transacciones++;
    }
  }
  
  //Metodo obtenerSaldo
  
  public void obtenerSaldo(){
    if (saldo - cs < 0){
      System.out.println("Error, No dispone de saldo suficiente en su cuenta para realizar esta operacion.");
    }
    else{
      saldo = saldo - cs;
      System.out.println("Su saldo es: " + saldo);
    }
  }
  
  //Metodo obtenerTransacciones
  
  public void obtenerTransacciones(){
    System.out.println("Transacciones realizadas: " + transacciones);
  }
  
}