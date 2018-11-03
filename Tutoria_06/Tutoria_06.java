//Importar Librerias

import java.util.*;

//Crear Clase Main

public class Tutoria_06{
	public static void main (String args[]){
		
//Crear Variables

		Dormitorio dormitorios[] = new Dormitorio[4];
		Baño baños[] = new Baño[2];

//Crear Objetos

		SalaDeEstar salas = new SalaDeEstar();
		Cocina cocinas = new Cocina();

		//Objeto Dormitorio

		for (int i = 0; i < 4; i++){
			dormitorios[i] = new Dormitorio();
		}

		//Objeto Baño

		for (int i = 0; i < 2; i++){
			baños[i] = new Baño();
		}

//Imprimir datos al usuario

		//Imprimir Dormitorio

		System.out.println("Cantidad de Dormitorios: 4\n");
		for (int i = 0; i < 4; i++){
			System.out.println("Dormitorio #"+(i+1));
			System.out.println("Camas: "+dormitorios[i].getCamas());
			System.out.println("Veladores: "+dormitorios[i].getVeladores());
			System.out.println("Closet: "+dormitorios[i].getClosets()+"\n");
		}

		//Imprimir Baños

		System.out.println("Cantidad de Baños: 2\n");
		for (int i = 0; i < 2; i++){
			System.out.println("Baño: #"+(i+1));
			System.out.println("Acondicionadores: "+baños[i].getAcondicionador());
			System.out.println("Shampoo "+baños[i].getShampoo());
			System.out.println("Jabones: "+baños[i].getJabones()+"\n");
		}

		//Imprimir SalaDeEstar

		System.out.println("Sala de Estar:\n");
		System.out.println("TV: "+salas.getTV());
		System.out.println("Consola: "+salas.getConsola());
		System.out.println("PC: "+salas.getPC());
		System.out.println("Sofas: "+salas.getSofas());
		System.out.println("Mesas: "+salas.getMesas());
		System.out.println("Sillas: "+salas.getSillas()+"\n");

		//Imprimir Cocina

		System.out.println("Cocina:\n");
		System.out.println("Mesas: "+cocinas.getMesas());
		System.out.println("Sillas: "+cocinas.getSillas());
	}

}
