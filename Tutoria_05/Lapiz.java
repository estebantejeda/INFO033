//Crear Clase Vestuario

public class Lapiz extends Hipermercado{
  
//Crear Atributos
  
  private String marca;
  private String color;
  private boolean tin_pas; 
  private boolean punta;
  
//Crear Constructores
  
  //Constructor Default
  
  public Lapiz(){
    super();
    marca = "Bic";
    color = "Rojo";
    tin_pas = true;
    punta = true;
  }
  
//Crear Metodos
  
  //Metodo setMarca
  
  public void setMarca(String marca){
    this.marca = marca;
  }
  
  //Metodo getMarca
  
  public String getMarca(){
    return marca;
  }
  
  //Metodo setColor
  
  public void setColor(String color){
    this.color = color;
  }
  
  //Metodo getColor
  
  public String getColor(){
    return color;
  }
  
  //Metodo setTinPas
  
  public void setTinPas(boolean tin_pas){
    this.tin_pas = tin_pas;
  }
  
  //Metodo getTinPas
  
  public String getTinPas(){
    String a;
    if (tin_pas){
      a = "Tinta";
    }
    else{
      a = "Pasta";
    }
    return a;
  }
  
  //Metodo setPunta
  
  public void setPunta(boolean punta){
    this.punta = punta;
  }
  
  //Metodo getPunta
  
  public String getPunta(){
    String a;
    if(punta){
      a = "Fina";
    }
    else{
      a = "Gruesa";
    }
    return a;
  }
  
}