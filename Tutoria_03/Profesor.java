//Crear Clase

public class Profesor extends Persona{
  
//Definir Atributos
  
  private String especialidad;
  
//Crear Constructores
  
  //Contructor Default
  
  public Profesor(){
    nombre = "Erick-Senpai";
    edad = 53;
    especialidad = "Programacion";
  }
  
//Crear Metodos
  
  //Metodo setEspecialidad
  
  public void setEspecialidad(String especialidad){
    this.especialidad = especialidad;
  }
  
  //Metodo getEspecialidad
  
  public String getEspecialidad(){
    return especialidad;
  }
  
}