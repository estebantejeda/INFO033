//Crear Clase Asignatura

class Asignatura{
  
//Definir Atributos
  
  private String nombre;
  private String responsable;
  
//Crear Constructores
  
  //Contructor Default
  
  public Asignatura(){
    nombre = "POO";
    responsable = "Tania";
  }
  
//Crear Metodos
  
  //Metodo setNombre
  
  public void setNombre(String nombre){
    this.nombre = nombre;
  }
  
  //Metodo getNombre
  
  public String getNombre(){
    return nombre;
  }
  
  //Metodo setResponsable
  
  public void setResponsable(String responsable){
    this.responsable = responsable;
  }
  
  //Metodo getResponsable
  
  public String getResponsable(){
    return responsable;
  }
  
}