//Importar Librerias

import java.util.*;
import javax.swing.*;

//Crear Main

public class DemoPersonas{
	public static void main(String[] args) {
	
//Crear Variables

		Estudiante estudianteArray[] = new Estudiante[10];
		Profesor profesorArray[] = new Profesor[10];
		int contP = 0;
		int contE = 0;
		String resp = "";
		String nombre = "";
		String direccion = "";
		String curso = "";
		String respu = "";
		String nota = "";
		String notaDouble = 0;
		boolean exito = true;
		boolean continuar = true;

//Crear Ciclico

//		while (true){

//Preguntar a Usuario si desea ingresar profesor o estudiante

		resp = JOptionPane.showInputDialog("Para profesor, ingrese P;\nOtra letra para Estudiante").trim();
		if (resp.equals("P")) {
			nombre = JOptionPane.showInputDialog("Profesor: ingrese su nombre, por favor").trim();
			direccion = JOptionPane.showInputDialog("Escriba su direccion").trim();
			profesorArray[contP] = new Profesor(nombre, direccion);
			JOptionPane.showMessageDialog(null, "Profesor: ".concat(profesorArray[contP].toCadena()));
			while (continuar){
				curso = JOptionPane.showInputDialog("Profesor: ingrese curso, Intro para finalizar").trim();
				while (!curso.equals("")){
					exito = profesorArray[contP].agregarCurso(curso);
					if (exito = true){
						JOptionPane.showMessageDialog(null, "Curso agregado");
					}
					else{
						JOptionPane.showMessageDialog(null, "No puede agregarse!!");
					}
					curso = JOptionPane.showInputDialog("Profesor: ingrese curso, Intro para finalizar").trim();
				}
				respu = JOptionPane.showInputDialog("Continua? (S/Otro valor)").trim();
				if (!resp.equals("S")){
					continuar = false;
				}
			}
		}
		else{
			nombre = JOptionPane.showInputDialog("Ingresa su nombre, por favor").trim();
			direccion = JOptionPane.showInputDialog("Escribe tu direccion").trim();
			estudianteArray[contE] = new Estudiante(nombre, direccion);
			JOptionPane.showMessageDialog(null, "Estudiante: ".concat(estudianteArray[contE].toCadena()));
			while (continuar){
				curso = JOptionPane.showInputDialog("Estudiante: ingresa tus cursos, Intro para finalizar").trim();
				nota = JOptionPane.showInputDialog("Estudiante: ingresa la nota de tu curso").trim();
				double notadouble = Double.parseDouble(nota);
				estudianteArray[contE].agregarCurso(curso, nota);
				while (!curso.equals("")){
					exito = profesorArray[contP].agregarCurso(curso);
					if (exito = true){
						JOptionPane.showMessageDialog(null, "Curso agregado");
					}
					else{
						JOptionPane.showMessageDialog(null, "No puede agregarse!!");
					}
					curso = JOptionPane.showInputDialog("Profesor: ingrese curso, Intro para finalizar").trim();
				}
				respu = JOptionPane.showInputDialog("Continua? (S/Otro valor)").trim();
				if (!resp.equals("S")){
					continuar = false;
				}
			}
		}
	}

}
//}