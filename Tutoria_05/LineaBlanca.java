//Crear Clase LineaBlanca

public class LineaBlanca extends Hipermercado{
  
//Crear Atributos
  
  private int capacidad;
  private int puertas;
  private boolean freezer;
  
//Crear Constructores
  
  //Constructor Default
  
  public LineaBlanca(){
    super();
    capacidad = 10;
    puertas = 2;
  }
  
//Crear Metodos
  
  //Metodo setCapacidad
  
  public void setCapacidad(int capacidad){
    this.capacidad = capacidad;
  }
  
  //Metodo getCapacidad
  
  public int getCapacidad(){
    return capacidad;
  }
  
  //Metodo setPuertas
  
  public void setPuertas(int puertas){
    this.puertas = puertas;
  }
  
  //Metodo getPuertas
  
  public int getPuertas(){
    return puertas;
  }
  
  //Metodo setFreezer
  
  public void setFreezer(boolean freezer){
    this.freezer = freezer;
  }
  
  //Metodo getFreezer
  
  public String getFreezer(){
    String a;
    if(freezer){
      a = "Posee Freezer";
    }
    else{
      a = "No Posee Freezer";
    }
    return a;
  }
  
}