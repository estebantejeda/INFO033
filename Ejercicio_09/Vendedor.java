//Importar Librerias a Java

import java.util.*;

//Crear Clase Video

class Vendedor{
  
//Definir Atributos a la Clase
  
  private int codigo;
  private int stock;
  
//Realizar Metodos
  
  //Metodo setCodigo
  
  public void setCodigo(int codigo){
    this.codigo = codigo;
  }
  
  //Metodo setStock
  
  public void setStock(int codigo){
    this.stock = codigo;
  }
  
  //Metodo estadoActual
  
  public void venta(int compra){
    if (compra <= stock){
      stock = stock - compra;
      System.out.println("Stock actual: " +stock);
    }
    else{
      System.out.println("Sin Stock");
    }
  }
}