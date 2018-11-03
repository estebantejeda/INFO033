//Importar Librerias

import java.util.*;

//Crear Main

public class Tutoria_08{
	public static void main (String args[]){
		
//Arreglo Dinamico

		ArrayList <String> arreglo_dinamico = new ArrayList <String>(); //Crear Arreglo Dinamico
		arreglo_dinamico.add("Hola"); //Añadir Elemento
		arreglo_dinamico.add(1, "Como estas"); //Añadir Elemento en posicion dada
		arreglo_dinamico.add("Chao");
		arreglo_dinamico.add(3, "Hola");
		System.out.println("Cantidad de elementos: " + arreglo_dinamico.size() ); //Devuelve cantidad de elementos en arreglo
		System.out.println("Elemento en posicion 1: " + arreglo_dinamico.get(1) ); //Devuelve elemento en la posicion dada
		System.out.println("Existe la palabra <Hola>: " + arreglo_dinamico.contains("Hola") ); //Comprueba si existe el elemento señalado
		System.out.println("Posicion de la palabra <Como estas>: " + arreglo_dinamico.indexOf("Como estas") ); //Entrega posicion de un elemento
		System.out.println("Posicion de la ultima palabra <Hola>: " + arreglo_dinamico.lastIndexOf("Hola") ); //Entrega posicion de la ultima palabra
		arreglo_dinamico.remove(3); //Borra Elemento en la posicion dada;
		arreglo_dinamico.add("Esteban");
		Object arreglo[] = arreglo_dinamico.toArray(); //Transformar arreglo dinamico a arreglo normal
		
		for (int i = 0; i < arreglo_dinamico.size(); i++){
			System.out.println(arreglo[i]);
		}
	}
}