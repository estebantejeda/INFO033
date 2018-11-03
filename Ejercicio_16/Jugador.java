//Crear Clase Jugador

public class Jugador{

//Crear Atributos

	private String nombre;
	private int puntaje;
	boolean boleto;

//Crear Metodos

	//Metodo setNombre

	public void setNombre(String nombre){
		if (nombre.charAt(0) >= 'A' && nombre.charAt(0) <= 'Z'){
			this.nombre = nombre;
		}
		else{
			this.nombre = "Sin Nombre"
		}
	}

	//Metodo getNombre

	public String getNombre(){
		return nombre;
	}

	//Metodo setPuntaje

	public void setPuntaje(int puntaje){
		if (puntaje >= 0){
			this.puntaje = puntaje;
		}
		else{
			this.puntaje = 0;
		}
	}

	//Metodo getPuntaje

	publc int getPuntaje(){
		return puntaje;
	}

}