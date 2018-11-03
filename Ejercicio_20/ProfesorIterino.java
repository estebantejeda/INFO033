//Importar Librerias

import java.util.*; //import java.util.Calendar;

//Crear Clase ProfesorInterino

public final class ProfesorInterino extends Profesor{

//Crear Objetos

	private Calendar FechaInicio;

//Crear Constructores

	//Crear Constructor #1

	pubilc ProfesorInterino(Calendar fechaInicio){
		super();
		FechaInicio = fechaInicio;
	}

	//Crear Constructor #2

	public ProfesorInterino(String nombre, String apellidos, int edad, Calendar fechaInicio){
		super (nombre, apellidos, edad);
		FechaInicio = fechaInicio;
	}



}