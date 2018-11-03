//Crear Clase Vestuario

public class Vestuario extends Hipermercado{
  
//Crear Atributos
  
  private String marca;
  private String color;
  private String procedencia;
  private String talla;
  private boolean genero;
  
//Crear Constructores
  
  //Constructor Default
  
  public Vestuario(){
    marca = "Maui & Sons";
    color = "Negro";
    procedencia = "China";
    talla = "L";
    genero = true;
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
  
  //Metodo setProcedencia
  
  public void setProcedencia(String procedencia){
    this.procedencia = procedencia;
  }
  
  //Metodo getProcedencia
  
  public String getProcedencia(){
    return procedencia;
  }
  
  //Metodo setTalla
  
  public void setTalla(String talla){
    this.talla = talla;
  }
  
  //Metodo getTalla
  
  public String getTalla(){
    return talla;
  }
  
  //Metodo setGenero
  
  public void setGenero(boolean genero){
    this.genero = genero;
  }
  
  //Metodo getGenero
  
  public String getGenero(){
    String a;
    if (genero){
      a = "Hombre";
    }
    else{
      a = "Mujer";
    }
    return a;
  }
  
}
