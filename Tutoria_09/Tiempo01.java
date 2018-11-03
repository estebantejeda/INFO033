//Importar Libreria

import java.util.*;
import java.text.*;

//Crear Clase Tiempo01

public class Tiempo01{

//Crear Atributos

	private int hora;
	private int minutos;
	private int segundos;

//Crear Constructores

	//Constructores Default

	public Tiempo01(){
		setTiempo(0, 0, 0);
	}

//Crear Metodos

	//Metodo setTiempo

	public void setTiempo(int hora, int minutos, int segundos){
		this.hora = (hora >= 0 && hora < 24) ? hora : 0;
		this.minutos = (minutos >= 0 && minutos < 60) ? minutos : 0;
		this.segundos = (segundos >= 0 && segundos < 60) ? segundos : 0;
	}

	//Metodo horaFormatoUniversal

	public String horaFormatoUniversal(){
		DecimalFormat dosDigitos = new DecimalFormat("00");
		String valor = dosDigitos.format(hora).concat(":");
		valor = valor.concat(dosDigitos.format(minutos)).concat(":");
		valor = valor.concat(dosDigitos.format(segundos)).concat(":");
		return valor;
	}

	//Metodo horaFormatoEstandar

	public String horaFormatoEstandar(){
		DecimalFormat dosDigitos = new DecimalFormat("00");
		String valor = Integer.toString((hora == 12 || hora == 0) ? 12: hora % 12);
		valor = valor.concat(":").concat(dosDigitos.format(minutos)).concat(":");
		valor = valor.concat(dosDigitos.format(segundos));
		valor = valor.concat((hora < 12 ? " AM" : " PM"));
		return valor;
	}

}