class ejercicio_03{
  public static void main (String args[]){
    
    //Película #1
    
    Pelicula uno = new Pelicula();
    uno.titulo = "Matrix";
    uno.genero = "Accion";
    uno.rating = 8;
    
    //Película #2
    
    Pelicula dos = new Pelicula();
    dos.titulo = "Terminator";
    dos.genero = "Ciencia Ficcion";
    uno.rating = 7;
    
    //Película #3
    
    Pelicula tres = new Pelicula();
    tres.titulo = "The Room";
    tres.genero = "Drama";
    tres.rating = 1;
    tres.play();
    
  }
}