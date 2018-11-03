//Importar Librerias a Java

import java.util.*;

//Crear Clase Personaje

class Personaje{
  
//Definir Atributos de la Clase
  
  protected String name;
  protected int health;
  protected int magic;
  protected int power;
  protected int resistance;
  
//Crear Contrusctores
  
  //Contructor Default
  
  public Personaje(){
    name = "PJ";
    health = 5;
    magic = 3;
    power = 1;
    resistance = 1;
  }
  
//Crear Objetos
  
  Random aleat = new Random();
  
//Realizar Metodos
  
  //Metodo setNombre
  
  public void setNombre(String name){
    this.name = name;
  }
  
  //Metodo getNombre
  
  public String getNombre(){
    return name;
  }
  
  //Metodo setVida
  
  public void setVida(){
    this.health = aleat.nextInt(16)+5;
  }
  
  //Metodo getVida
  
  public int getVida(){
    return health;
  }

  //Metodo setMagia
  
  public void setMagia(){
    this.magic = aleat.nextInt(16)+5;
  }
  
  //Metodo getMagia
  
  public int getMagia(){
    return magic;
  }  
  
  //Metodo setFuerza
  
  public void setFuerza(){
    this.power = aleat.nextInt(10)+1;
  }
  
  //Metodo getFuerza
  
  public int getFuerza(){
    return power;
  }
  
  //Metodo setResistencia
  
  public void setResistencia(){
    this.resistance = aleat.nextInt(10)+1;
  }
  
  //Metodo getResistencia
  
  public int getResistencia(){
    return resistance;
  }

  //Metodo equilibraStats

  public void equilibraStats(){
   while (health + power + resistance < 25){
      setMagia();
    setFuerza();
    setResistencia();
   }
  }
  
  //Metodo imprimeStats
  
  public void imprimeStats(){
    System.out.println(name);
    System.out.println("Vida: " +health);
    System.out.println("Magia: " +magic);
    System.out.println("Poder: " +power);
    System.out.println("Resistencia: " +resistance);
  }
  
}