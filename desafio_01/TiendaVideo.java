//Importar Librerias a Java

import java.util.*;

//Crear Clase Video

class TiendaVideo{
  
//Definir Atributos a la Clase
  
  Video[] peliculas = new Video[10];
  int i = 0;
  
//Realizar Metodos
  
  //Metodo mostrarVideos
  
  public void mostrarVideos(){
    if (i == 0){
      System.out.println("No se Encuentran Peliculas Registradas");
    }
    else{
      System.out.println("");
      for (int j = 0; j < i; j++){
        System.out.println(i+".- "+peliculas[j].getTitulo());
      }
    }
  }
  
  //Metodo agregarVideo
  
  public void agregarVideo(String video){
    if (i < 10){
      peliculas[i] = new Video();
      peliculas[i].setTitulo(video);
      i++;
      System.out.println("Pelicula Añadida con Exito!");
    }
    else{
      System.out.println("Error!, Se ha Superado el Limite de Peliculas.");
    }
  }
  
  //Metodo arendarVideo
  
  public void arrendarVideo(String video){
    String titulo;
    boolean tit = true;
    for (int j = 0; j < i; j++){
      titulo = peliculas[j].getTitulo();
      if (titulo.equalsIgnoreCase(video) && peliculas[j].getArriendo() == false){
        peliculas[j].setArriendo(true);
        System.out.println("Pelicula Arrendada con Exito!");
        tit = false;
        break;
      }
    }
    if (tit){
      System.out.println("Error!, No se Encuentra la Pelicula");
    }
  }
  
  //Metodo devolverVideo
  
  public void devolverVideo(String video){
    String titulo;
    boolean tit = true;
    for (int j = 0; j < i; j++) {
      titulo = peliculas[j].getTitulo();
      if (titulo.equalsIgnoreCase(video) && peliculas[j].getArriendo() == true) {
        peliculas[j].setArriendo(false);
        System.out.println("Pelicula Devuelta con Exito!");
        tit = false;
        break;
      }
    }
    if (tit){
      System.out.println("Error!, No se Encuentra la Pelicula o ya Fue Devuelta");
    }
  }
  
}