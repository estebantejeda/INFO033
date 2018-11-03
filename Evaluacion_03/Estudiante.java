//Importar Librerias

import java.util.*;
import javax.swing.*;

//Crear Clase Estudiante

public class Estudiante extends Persona{

//Crear Variables

	private String cursos[] = new String[30];
	private double notas[] = new double[30];
	private int numCursos;

//Crear Constructores

	public Estudiante(String nombre, String direccion){
		super(nombre, direccion);
		numCursos = 0;
	}

//Crear Metodos	

	//Metodo agregarCurso

	public void agregarCurso(String curso, double nota){
		if (numCursos <= 30){
			numCursos++;
			cursos[numCursos-1] = curso;
			notas[numCursos-1] = nota;
			JOptionPane.showMessageDialog(null, "Curso Agregado");
		}
		else{
			JOptionPane.showMessageDialog(null, "Ha superado el limite de cursos");
		}
	}

	//Metodo imprimirNotas

	public void imprimirNotas(){
		String notaimpresa = "";
		for (int i = 0; i < (numCursos-1); i++){
			notaimpresa = notaimpresa+cursos[i]+" : "+notas[i]+"\n";
		}
		JOptionPane.showMessageDialog(null, notaimpresa);
	}

	//Metodo getNotaPromedio

	public double getNotaPromedio(){
		double promedio = 0;
		for (int i = 0; i < (numCursos-1); i++){
			promedio = promedio + notas[i];
		}
		promedio = promedio/numCursos;
		return promedio;
	}



}