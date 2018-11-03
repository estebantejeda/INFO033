//Crear Clase Guerrero

public class Guerrero extends Personaje{
  
//Definir Atributos de la Clase
  
  private String weapon;
  private int attack;
  private int defence;
  
//Crear Constructor
  
  //Constructor Default
  
  public Guerrero(){
    weapon = "Espada";
    attack = 5;
    defence = 2;
  }
  
  //Constructor #1
  
  public Guerrero(int health, int magic, int power, int resistance){
    weapon = "Espada";
    super.health = health;
    super.magic = magic;
    super.power = power;
    super.resistance = resistance;
    attack = 5;
    defence = 2;
  }
  
//Realizar Metodos
  
  //Metodo getArma
  
  public String getArma(){
    return weapon;
  }
  
  //Metodo getAtaque
  
  public int getAtaque(){
    return attack;
  }
  
  //Metodo getDefensa
  
  public int getDefensa(){
    return defence;
  }
  
}