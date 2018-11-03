//Importar Librerias

import java.util.*;

//Crear Clase Casas

public class Casa{
  
//Definir Atributos
  
  private String nombre;
  private String animal;
  private int alum;
  private int prof;
  
//Crear Constructores
  
  //Contructor Default
  
  public Casa(){
    nombre = "UACh";
    animal = "Pinguino";
    alum = 10;
    prof = 5;
  }
  
//Crear Objetos
  
  Scanner t = new Scanner(System.in);
  Alumno alumnos[] = new Alumno[alum];
  Profesor profesores[] = new Profesor[prof];
  
//Crear Metodos
  
  //Metodo setNombre
  
  public void setNombre(String nombre){
    this.nombre = nombre;
  }
  
  //Metodo getNombre
  
  public String getNombre(){
    return nombre;
  }
  
  //Metodo setAnimal
  
  public void setAnimal(String animal){
    this.animal = animal;
  }
  
  //Metodo getAnimal
  
  public String getAnimal(){
    return animal;
  }
  
  //Metodo setAlum
  
  public void setAlum(int alum){
    while (alum < 10 || alum > 25){
      System.out.println("Error, numero fuera de rango [10, 25]");
      alum = t.nextInt();
    }
    this.alum = alum;
  }
  
  //Metodo setProf
  
  public void setProf(int prof){
    while (prof < 2 || prof > 3){
      System.out.println("Error, numero fuera de rango [2, 3]");
      prof = t.nextInt();
    }
    this.prof = prof;
  }
  
}