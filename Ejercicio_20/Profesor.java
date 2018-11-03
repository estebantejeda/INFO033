//Crear Clase Profesor

public class Profesor extends Persona{

//Crear Atributos

	private String id_prof;

//Crear Constructores

	//Constructor Default

	public Profesor(){
		super();
		id_prof = "Desconocido";
	}

	//Constructor #1

	public Profesor(String nombre, String apellidos, int edad){
		super(nombre, apellidos, edad);
		id_prof = "Desconocido";
	}

//Crear Metodos

	//Metodo setID

	public void setIDProfesor(String id){
		this.id_prof = id_prof;
	}

	//Metodo getID

	public String getIDProfesor(){
		return id_prof;
	}

	//Metodo mostrarDatos

	public void mostrarDatos(){
		System.out.println("Datos del Profesor:");
		System.out.println("Nombre: " +getNombre());
		System.out.println("Apellidos: " +getApellidos());
		System.out.println("Identificacion: " +getIDProfesor());
	}

}