import java.util.*;
public class ejercicio_15{
  public static void main(String args[]){
    Personas persona[] = new Personas[30];
    for (int i = 0; i < 30; i++){
      persona[i] = new Personas();
      persona[i].setNombre(i);
      persona[i].setPaga(i);
    }
    System.out.println("Inscipciones Cerradas");
  }
}