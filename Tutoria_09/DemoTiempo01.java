import java.util.*;

public class DemoTiempo01{
	public static void main (String args[]){
		
		Tiempo01 reloj = new Tiempo01();
		Scanner teclado = new Scanner(System.in);

		String salida = "La hora universal inicial es: ".concat(reloj.horaFormatoEstandar());
		System.out.println("salida");
		salida = "La hora estandar inicial es ".concat(reloj.horaFormatoUniversal());
		System.out.println(salida);
		System.out.println("Ingrese hh:mm:ss");
		reloj.setTiempo(teclado.nextInt(), teclado.nextInt(), teclado.nextInt());
		salida = "La hora universal ingresada es: ".concat(reloj.horaFormatoUniversal());
		System.out.println(salida);
		salida = "La hora estandar ingresada es: ".concat(reloj.horaFormatoEstandar());
		System.out.println(salida);

	}
}