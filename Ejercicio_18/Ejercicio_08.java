//Importar Librerias

import java.util.*;

//Crear Clase Factura

public class Ejercicio_08{
	public static void main (String args[]){

//Crear Objetos

		Scanner t = new Scanner(System.in);

//Declarar Variables

		int x;

//Pedir datos al Usuario

		x = validaNumero("Ingrese la cantidad de productos que desea en la factura:");
		Factura factura[] = new	Factura[x];

//Crear Objetos

		for (int i = 0; i < x; i++){
			factura[i] = new Factura("", "", 0, 0.0);
			System.out.println("\nIngresando Producto #"+(i+1));
			System.out.println("Ingrese el codigo del Producto:");
			factura[i].setCodigo(t.nextLine());
			System.out.println("Ingrese la Descripcion del Producto:");
			factura[i].setDescripcion(t.nextLine());
			System.out.println("Ingrese la cantidad del Producto:");
			factura[i].setCantidad(t.nextInt());
			System.out.println("Ingrese Precio unitario de Producto:");
			factura[i].setPrecio(t.nextInt());
			t.nextLine();
		}
		System.out.println("\nImprimiendo Factura........\n");
		imprimeFactura(factura);

	}

//Realizar Metodos

	//Metodo validaNumero

	public static int validaNumero(String msj){
		Scanner sc = new Scanner(System.in);
		System.out.println(msj);
		int num = sc.nextInt();
		while (num <= 0){
			System.out.println("Error!, numero no valido, intente nuevamente.\n");
			System.out.println(msj);
			num = sc.nextInt();
		}
		return num;
	}

	//Metodo imprimeFactura

	public static void imprimeFactura(Factura factura[]){
		double total = 0;
		System.out.print("============================================================");
		System.out.println("===================\n");		
		System.out.println("\t\t\t****** FACTURA STEAM S.A. ******");
		System.out.print("============================================================");
		System.out.print("===================\n");
		System.out.println("Codigo\t Descripcion\t\t\t Cantidad\tPrecio\t\tTotal");
		System.out.println("--------------------------------------");
		for (int i = 0; i < factura.length; i++){
			System.out.print(factura[i].getCodigo().concat("\t "));
			System.out.print(factura[i].getDescripcion().concat("\t "));
			if(factura[i].getDescripcion().length() < 30){
				System.out.print("\t");
			}
			if(factura[i].getDescripcion().length() < 40){
				System.out.print("\t");
			}
			System.out.print(factura[i].getCantidad()+("\t"));
			System.out.print(factura[i].getPrecio()+("\t\t"));
			System.out.print(factura[i].obtenerMontoFactura()+"\n");
			total = total + factura[i].obtenerMontoFactura();
		}
		System.out.print("___________________________________________________________");
		System.out.print("____________________\n");
		System.out.print("\nTotal:\t\t\t\t\t\t\t\t\t");
		System.out.println("$"+total);
		System.out.print("============================================================");
		System.out.println("===================\n");
	}

}