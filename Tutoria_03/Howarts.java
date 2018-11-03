//Importar Librerias

import java.util.*;

//Crear Clase Howarts

public class Howarts{
  
//Definir Atributos
  
  private int cas;
  
//Crear Constructores
  
  //Contructor Default
  
  public Howarts(){
    cas = 4;
  } 
  
//Crear Objetos
  
  Scanner t = new Scanner(System.in);
  
//Crear Metodos
  
  //Metodo setCas
  
  public void setCas(int cas){
    while (cas < 1 || cas > 4){
      System.out.println("Error, numero fuera de rango [1, 4]");
      cas = t.nextInt();
    }
    this.cas = cas;
  }    
  
  //Metodo nombreCasas
  
  public void nombreCasas(){
    Casa casas[] = new Casa[cas];
    for (int i = 0; i < cas; i++){
      System.out.println("Ingrese el nombre de cada casa: #"+(i+1));
      casas[i] = new Casa();     
      casas[i].setNombre(t.nextLine());
    }
  }
  
  //Metodo animalCasas
  
  public void animalCasas(){
    Casa casas[] = new Casa[cas];
    for (int i = 0; i < cas; i++){
      System.out.println("Ingrese el animal de cada casa: #"+(i+1));
      casas[i] = new Casa();
      casas[i].setAnimal(t.nextLine());
    }
  }
  
  //Metodo alumCasas
  
  public void alumCasa(){
    Casa casas[] = new Casa[cas];
    for (int i = 0; i < cas; i++){
      System.out.println("Ingrese la cantidad de alumnos para la casa: #"+(i+1));
      casas[i] = new Casa();
      casas[i].setAlum(t.nextInt());
    }
  }
  
  //Metodo profCasas
  
  public void profCasa(){
    Casa casas[] = new Casa[cas];
    for (int i = 0; i < cas; i++){
      System.out.println("Ingrese la cantidad de profesoras para la casa: #"+(i+1));
      casas[i] = new Casa();
      casas[i].setProf(t.nextInt());
    }  
  }
  
}