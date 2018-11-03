//Importar Librerias

import java.util.*;

//Crear Clase Fecha

public class Fecha{
  
//Crear Atributos
  
  private int dia, mes, año;
  private boolean b;
  
//Crear Constructor
  
  //Constructor Default
  
  public Fecha(){
   dia = 1;
   mes = 1;
   año = 2000;
  }  
  
//Crear Objetos
  
  Scanner t = new Scanner(System.in);
  
//Crear Metodos
  
  //Metodo setDia
  
  public void setDia(int dia){
    this.dia = dia;
  }
  
  //Metodo getDia
  
  public int getDia(){
    return dia;
  }
  
  //Metodo setMes
  
  public void setMes(int mes){
    this.mes = mes;
  }
  
  //Metodo getMes
  
  public int getMes(){
    return mes;
  }
  
  //Metodo setAño
  
  public void setAño(int año){
    this.año = año;
  }
  
  //Metodo getAño
  
  public int getAño(){
    return año;
  }
  
  //Metodo asignarFecha
  
  public void asignarFecha(){
    System.out.println("Ingrese Dia");
    setDia(t.nextInt());
    System.out.println("\nIngrese Mes");
    setMes(t.nextInt());
    System.out.println("\nIngrese Año");
    setAño(t.nextInt());
  }
  
  //Metodo esBisiesto
  
  public boolean esBisiesto(){
    boolean b = false;
    if(año%4 == 0 && año%100 != 0 || año%400  == 0){
      b = true;
    }
    return b;
  }
  
}