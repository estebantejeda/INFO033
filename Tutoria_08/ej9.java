//Importar Librerias

import java.util.*;

//Crear Clase ej9

public class ej9{
	public static void main(String[] args) {
		
//Explicación al Usuario

		System.out.println("Algoritmo que pide al usuario una cantidad 'n' de numeros y los ordena a eleccion.");
		System.out.println("El programa finaliza con '0'.");

//Crear Clase

		ArrayList <Integer> arrayNumerico = new ArrayList <Integer>();

//Declarar Variables

		int x = 0;
		int a = 0;

//Pedir Datos al Usuario

		do{
			b++;
			x = ingresaNumero("Ingrese Numero # ", b);
			arrayNumerico.add(x);
		}while (x != 0);

//Imprimir Datos al Usuario

		for (int i = 0; i < arrayNumerico.size(); i++){
			System.out.println(arrayNumerico.get(i));
		}		

	}

//Realizar Metodos

	//Metodo ingresaNumero

	public static int ingresaNumero(String msj, int cont){
		Scanner sc = new Scanner(System.in);
		System.out.println("\n".concat(msj)+cont);
		int var = sc.nextInt();
		return var;
	}

}