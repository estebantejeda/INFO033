//Crear Clase Carpeta

public class Carpeta extends Hipermercado{
  
//Crear Atributos
  
  private int tamaño;
  private String color;
  private boolean archivador;
  
//Crear Constructores
  
  //Constructor Default
  
  public Carpeta(){
    super();
    tamaño = 10;
    color = "Rojo";
    archivador = true;
  }
  
//Crear Metodos
  
  //Metodo setTamaño
  
  public void setTamaño(int tamaño){
    this.tamaño = tamaño;
  }
  
  //Metodo getTamaño
  
  public int getTamaño(){
    return tamaño;
  }
  
  //Metodo setColor
  
  public void setColor(String color){
    this.color = color;
  }
  
  //Metodo getColor
  
  public String getColor(){
    return color;
  }
  
  //Metodo setArchivador
  
  public void setArchivador(boolean archivador){
    this.archivador = archivador;
  }
  
  //Metodo getArchivador
  
  public String getArchivador(){
    String a;
    if(archivador){
      a = "Si";
    }
    else{
      a = "No";
    }
    return a;
  }
  
}