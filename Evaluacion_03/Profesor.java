//Importar Librerias

import java.util.*;
import javax.swing.*;

//Crear Clase Profesor

public class Profesor extends Persona{

//Crear Variables

	private String cursos[] = new String[10];
	private int numCursos = 0;

//Crear Constructores

	Profesor(String nombre, String direccion){
		super(nombre, direccion);
		numCursos = 0;
	}

//Crear Metodos	

	//Metodo agregarCurso

	public boolean agregarCurso(String curso){
		boolean exito = true;
		if (numCursos <= 10){
			numCursos++;
			cursos[numCursos-1] = curso;
			return exito;
		}
		else{
			exito = false;
			return exito;
		}
	}

/*	//Metodo removerCurso

	public boolean removerCurso(String curso){

	}*/

}