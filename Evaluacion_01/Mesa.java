//Crear Clase Mesa

public class Mesa{

//Crear Atributos

  private String codigo;
  private int capacidad;
  private boolean ocupada;

//Realizar Metodos

  //Metodo setCodigo

  public void setCodigo(String c){
    codigo = c;
  }

  //Metodo setCapacidad

  public void setCapacidad(int c){
    capacidad = c;
  }

  //Metodo setOcupada

  public void setOcupada(boolean o){
    ocupada = o;
  }

  //Metodo getCodigo

  public String getCodigo(){
    return codigo;
  }

  //Metodo getCapacidad

  public int getCapacidad(){
    return capacidad;
  }

//Metodo getOcupada

  public boolean getOcupada(){
    return ocupada;
  }
  
}