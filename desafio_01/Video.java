//Importar Librerias a Java

import java.util.*;

//Crear Clase Video

class Video{
  
//Definir Atributos a la Clase
  
  private String titulo;
  private boolean arriendo;
  
//Realizar Metodos
  
  //Metodo setTitulo
  
  public void setTitulo(String titulo){
    this.titulo = titulo;
  }
  
  //Metodo getTitulo
  
  public String getTitulo(){
    return titulo;
  }
  
  //Metodo setArriendo
  
  public void setArriendo(boolean arriendo){
    this.arriendo = arriendo;
  }
  
  //Metodo getArriendo
  
  public boolean getArriendo(){
    return arriendo;
  }
  
}