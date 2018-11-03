//Crear Clase Cuaderno

public class Cuaderno extends Hipermercado{
  
//Crear Atributos
  
  private int tamaño;
  private int cant_hoj;
  private String color;
  private String origen;
  private boolean hoja;
  
//Crear Constructores
  
  //Constructor Default
  
  public Cuaderno(){
    super();
    tamaño = 15;
    cant_hoj = 100;
    color = "Rojo";
    origen = "China";
    hoja = true;
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
  
  //Metodo setCantHoj
  
  public void setCantHoj(int cant_hoj){
    this.cant_hoj = cant_hoj;
  }
  
  //Metodo getCantHoj
  
  public int getCantHoj(){
    return cant_hoj;
  }
  
  //Metodo setColor
  
  public void setColor(String color){
    this.color = color;
  }
  
  //Metodo getColor
  
  public String getColor(){
    return color;
  }
  
  //Metodo setOrigen
  
  public void setOrigen(String origen){
    this.origen = origen;
  }
  
  //Metodo getOrigen
  
  public String setOrigen(){
    return origen;
  }
  
  //Metodo setHoja
  
  public void setHoja(boolean hoja){
    this.hoja = hoja;
  }
  
  //Metodo getHoja
  
  public String getHoja(){
    String a;
    if (hoja){
      a = "Cuadriculada";
    }
    else{
      a = "Dibujo";
    }
    return a;
  }
  
}