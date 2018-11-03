//Importar Librerias

import java.util.*;

//Crear Clase

public class Alumno extends Persona{
  
//Definir Atributos
  
  private int asi;
  
//Crear Constructores
  
  //Contructor Default
  
  public Alumno(){
    nombre = "Esteban";
    edad = 19;
    asi = 5;
  }
  
//Crear Objetos
  
  Scanner t = new Scanner(System.in);
  Asignatura asignaturas[] = new Asignatura[asi];
  
//Crear Metodos
  
  //Metodo setAsi
  
  public void setAsi(int asi){
    while (asi < 1 || asi > 5){
      System.out.println("Error, numero fuera de rango [1, 5]");
      asi = t.nextInt();
    }
    this.asi = asi;
  }
  
}