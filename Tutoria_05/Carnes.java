//Crear Clase Carnes

public class Carnes extends Hipermercado{
  
//Crear Atributos
  
  private int fecha_enva;
  private int fecha_venc;
  private int materia_gs;
  private int peso;
  private String origen;
  
//Crear Constructores
  
  //Contrusctor Default
  
  public Carnes(){
    super();
    fecha_enva = 270415;
    fecha_venc = 270416;
    materia_gs = 20;
    peso = 500;
    origen = "Vacuno";
  } 
  
//Crear Metodos
  
  //Metodo setFechaEnva
  
  public void setFechaEnva(int fecha_enva){
    this.fecha_enva = fecha_enva;
  }
  
  //Metodo getFechaEnva
  
  public int getFechaEnva(){
    return fecha_enva;
  }
  
  //Metodo setFechaVenc
  
  public void setFechaVenc(int fecha_venc){
    this.fecha_venc = fecha_venc;
  }
  
  //Metodo getFechaVenc
  
  public int getFechaVenc(){
    return fecha_venc;
  }
  
  //Metodo setMateriaGs
  
  public void setMateriaGs(int materia_gs){
    this.materia_gs = materia_gs;
  }
  
  //Metodo getMateriaGs
  
  public int getMateriaGs(int materia_gs){
    return materia_gs;
  }
  
  //Metodo setPeso
  
  public void setPeso(int peso){
    this.peso = peso;
  }
  
  //Metodo getPeso
  
  public int getPeso(){
    return peso;
  } 
  
  //Metodo setOrigen
  
  public void setOrigen(String origen){
    this.origen = origen;
  }
  
  //Metodo getOrigen
  
  public String getOrigen(){
    return origen;
  }
  
}