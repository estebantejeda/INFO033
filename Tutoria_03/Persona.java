//Crear Clase Persona

public class Persona{
  
//Definir Atributos
  
  protected String nombre;
  protected int edad;
  
//Crear Metodos
  
  //Metodo setNombre
  
  public void setNombre(String nombre){
    this.nombre = nombre;
  }
  
  //Metodo getNombre
  
  public String getNombre(){
    return nombre;
  }
  
  //Metodo setEdad
  
  public void setEdad(int edad){
    this.edad = edad;
  }
  
  //Metodo getEdad
  
  public int getEdad(){
    return edad;
  }
  
}