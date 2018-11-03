//Importar Librerias

import java.util.*;

//Crear Main

public class Juego{
	public static void main (String args[]){

//Declarar Variables

		Carta cartas[] = new Carta[20];
		int k = 0;

//Crear Cartas

		while (k < 20){
			for (int i = 1; i <= 5; i++){
				cartas[k] = new Carta();
				cartas[k].setNumero(i);
				cartas[k].setColor(k);
				k++;
			}
		}

//Imprimir Cartas

		for (int i = 0; i < 20; i++){
			System.out.println("Carta: "+cartas[i].getNumero());
			System.out.println("Color: "+cartas[i].getColor()+"\n");
		}

//

	}
	
}