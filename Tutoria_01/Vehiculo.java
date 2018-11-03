//Importar librerias a Java

import java.util.*;

//Crear Clase 

public class Vehiculo{
  private String dueno;
  private String modelo;
  private String marca;
  private String color;
  private int kmetraje;
  private int puertas;
  private int potencia;
  private int cambios;
  
//Realizar Metodos
  
  public Vehiculo(){
    dueno = "Esteban Tejeda";
    modelo = "Subaru";
    marca = "Station Back";
    color = "rojo";
    kmetraje = 20000;
    puertas = 4;
    potencia = 240;
    cambios = 6;
  }
  
  //Metodo definirDueno
  
  public void definirDueno(){
    Scanner teclado = new Scanner(System.in);
    System.out.println("Definir Dueno: ");
    dueno = teclado.nextLine();
  }
  
  //Metodo definirModelo
  
  public void definirModelo(){   
    Scanner teclado = new Scanner(System.in);
    System.out.println("Definir Modelo: "); 
    modelo = teclado.nextLine();
  }
  
  //Metodo definirMarca
  
  public void definirMarca(){
    Scanner teclado = new Scanner(System.in);
    System.out.println("Definir Marca: ");    
    marca = teclado.nextLine();
  }
  
  //Metodo definirColor(){
  
  public void definirColor(){
    Scanner teclado = new Scanner(System.in);
    System.out.println("Definir Color: ");
    color = teclado.nextLine();
  }
  
  //Metodo aumentoKmetraje
  
  public void aumentoKmetraje(){
    Scanner teclado = new Scanner(System.in);
    System.out.println("Definir Kilometraje: ");
    int km = teclado.nextInt();
    while (km < 0){
      System.out.println("No se pueden agregar kilometros negativos");
      System.out.println("Definir Kilometraje: ");
      km = teclado.nextInt();
    }
    kmetraje = kmetraje + km;
  }
  
  //Metodo definirPuertas
  
  public void definirPuertas(){
    Scanner teclado = new Scanner(System.in);
    System.out.println("Definir Puertas: ");
    puertas = teclado.nextInt();
    while (puertas < 2 || puertas > 5){
      System.out.println("Los vehiculos poseen de 2 a 5 puertas");
      puertas = teclado.nextInt();
    }
  }
  
  //Metodo definirPotencia
  
  public void definirPotencia(){
    Scanner teclado = new Scanner(System.in);
    System.out.println("Definir Potencia: ");
    potencia = teclado.nextInt();
    while (potencia < 0){
      System.out.println("No puede existir una potencia negativa");
      potencia = teclado.nextInt();
    }
  }
  
  //Metodo definirCambios
  
  public void definirCambios(){
    Scanner teclado = new Scanner(System.in);
    System.out.println("Definir Cambios: ");
    cambios = teclado.nextInt();
    while (cambios < 6 || cambios > 12){
      System.out.println("No puede existir una potencia negativa");
      potencia = teclado.nextInt();
    }    
  }
  
  //Metodo imprimeInformacion
  
  public void imprimeInformacion(){
    System.out.println("Dueno: " +dueno);
    System.out.println("Modelo: " +modelo);
    System.out.println("Marca: " +marca);
    System.out.println("Color: " +color);
    System.out.println("Kilometraje: " +kmetraje);
    System.out.println("Puertas: " +puertas);
    System.out.println("Potencia: " +potencia+ " RPM");
    System.out.println("Cambios: " +cambios);
  }

}