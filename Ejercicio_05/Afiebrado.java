public class Afiebrado{
  String nombre;
  double temp;
  
  public void medicar(){
    while (temp > 37){
      System.out.println("Soy " + nombre + ". Tengo " + temp + " de fiebre, me tomare una aspirina!\n");
      temp--;
    }
    System.out.println("Soy " + nombre + ", estoy bien\n");
  }
}