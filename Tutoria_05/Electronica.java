//Crear Clase Electronica

public class Electronica extends Hipermercado{
  
//Crear Atributos
  
  private String marca;
  private String eficiencia;
  
//Crear Constructores
  
  //Constructor Default
  
  public Electronica(){
    super();
    marca = "TejedaZ";
    eficiencia = "A++";
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
  
  //Metodo setEficiencia
  
  public void getEficiencia(int a){
    switch (a){
      case 1:
        eficiencia = "A++";
        break;
      case 2:
        eficiencia = "A+";
        break;
      case 3:
        eficiencia = "B";
        break;
      case 4:
        eficiencia = "C";
        break;
    }
  }
  
  //Metodo getEficiencia
  
  public String getEficiencia(){
    return eficiencia;
  }
  
}
