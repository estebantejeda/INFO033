//Crear Clase Carta

public class Carta{

//Crear Atributos

	private int numero;
	private String color;

//Crear Metodos

	//Metodo setNumero

	public void setNumero(int numero){
		this.numero = numero;
	}

	//Metodo getNumero

	public int getNumero(){
		return numero;
	}

	//Metodo setColor

	public void setColor(int numero){
		if (numero < 5){
			color = "Blanco";
		}
		else if (numero >= 5 && numero < 10){
			color = "Negro";
		}
		else if (numero >= 10 && numero < 15){
			color = "Azul";
		}
		else{
			color = "Rojo";
		}
	}

	//Metodo getColor

	public String getColor(){
		return color;
	}

}