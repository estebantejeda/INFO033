//Importar Librerias

import java.util.*;

//Crear Main

public class DemoComplejos{
	public static void main (String args[]){

//Declarar Variables

		String x, y;
		double a, b;
		boolean pos = true;

//Crear Objetos

		Complejo complejo01 = new Complejo();
		Complejo complejo02 = new Complejo();

//Explicacion de Algorimo al Usuario

		System.out.println("Algoritmo que pide al usuario el ingreso de dos numeros imaginarios para luego realizar una suma y una resta.");

//Pedir datos al usuario y realizar Calculos

		x = leaComplejo("\nIngrese primer numero en la forma 'a + jb':");
		y = leaComplejo("\nIngrese segundo numero en la forma 'a + jb':");
		extraeNumero(x);
		extraeNumero(y);
		System.out.println(complejo01.getReal());

	}

//Realizar Metodos

	//Metodo leaComplejo

	public static String leaComplejo(String msj){
		Scanner t = new Scanner(System.in);
		System.out.println(msj);
		String numero = t.nextLine().trim();
		while (numero.equals("")){
			System.out.println("Error, debe ingresar un caracter. Intente nuevamente");
			System.out.println(msj);
			numero = t.nextLine().trim();
		}
		return numero;
	}

	//Metodo extraeNumero

	public static void extraeNumero(String num){ //int
		String discriminador = "";
		String num_real ="";
		String num_imag = "";
		int posicion = 0;
		int x = 0;
		int y = 1;
		int contador = 0;
		while(!discriminador.equals("+")){
			discriminador = num.substring(x, y);
			num_real = num_real.concat(discriminador);
			x++;
			y++;
			contador++;
			discriminador = num.substring(x, y);
		}
		x = contador + 2;
		y = num.length();
		num_imag = num.substring(x, y);
		double real = Double.parseDouble(num_real);
		double imaginaria = Double.parseDouble(num_imag);
	}

	//Metodo imprimeComplejo

	public static void imprimeComplejo(msj, double real, double imaginaria){

	}

}