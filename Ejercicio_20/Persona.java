//Crear Clase Persona

public class Persona{

//Crear Atributos

	private String nombre;
	private String apellidos;
	private int edad;

//Crear Constructores

	//Constructor Default

	public Persona(){
		nombre = "";
		apellidos = "";
		edad = 0;
	}

	//Constructor #1

	public Persona(String nombre, String apellidos, int edad){
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad
	}

//Crear Metodos

	//Metodo getNombre

	public String getNombre(){
		return nombre;
	}

	//Metodo getApellidos

	public String getApellidos(){
		return apellidos;
	}

	//Metodo getEdad

	public int getEdad(){
		return edad;
	}

}