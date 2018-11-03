//Importar Librerias

import java.util.*;

//Crear Clase Hipermercado

public class Hipermercado{
  
//Crear Atributos
  
  private int codigo;
  private int precio;
  private String producto;

//Crear Objetos

  Random aleat = new Random();
  
//Crear Constructores
  
  //Constructor Default
  
  public Hipermercado(){
    codigo = aleat.nextInt(999)+1;
    precio = 1000;
    producto = "Lacteos";
  }
  
//Crear Metodos
  
  //Metodo setCodigo
  
  public void setCodigo(int codigo){
    this.codigo = codigo;
  }
  
  //Metodo getCodigo
  
  public int getCodigo(){
    return codigo;
  }
  
  //Metodo setPrecio
  
  public void setPrecio(int precio){
    this.precio = precio;
  }
  
  //Metodo getPrecio
  
  public int getPrecio(){
    return precio;
  }
  
  //Metodo setProducto
  
  public void setProducto(String producto){
    this.producto = producto;
  }
  
  //Metodo getProducto
  
  public String setProducto(){
    return producto;
  }
  
}