//Importar Librerias

import java.util.*;

//Crear Clase Personas

public class Personas{
  
//Crear Atributos
  
  String nombre;
  boolean limite;
  
//Crear Metodos
  
  //Metodo setPaga
  
  public void setPaga(int c){
    if(c < 10){
      System.out.println(nombre+": Tu inscripcion es gratuita");
    }
    else{
      System.out.println(nombre+": Debes pagar la Inscripcion");
    }
  }
  
  //Metodo setNombre
  
  public void setNombre(int c){
    Scanner t = new Scanner(System.in);
    System.out.println("\nIngrese su Nombre: ");
    nombre = t.nextLine();
  }

}
