//Crear Clase Guerrero

public class Mago extends Personaje{
  
//Definir Atributos de la Clase
  
  private String weapon;
  private int attack;
  private int defence;
  
//Crear Constructor
  
  //Constructor Default
  
  public Guerrero(){
    weapon = "Espada";
    attack = 3;
    defence = 1;
  }
  
  //Constructor #1
  
  public Guerrero(int health, int magic, int power, int resistance){
    weapon = "Espada";
    super.health = health;
    super.magic = magic+3;
    super.power = power;
    super.resistance = resistance;
    attack = 3;
    defence = 1;
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