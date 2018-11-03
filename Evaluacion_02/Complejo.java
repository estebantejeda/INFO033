//Importar Librerias

import java.util.*;

//Crear Clase Complejo

public class Complejo{

//Crear Atributos

	private double real;
	private double imaginaria;

//Crear Constructores

	//Constructor Default

	public Complejo(){
		this.real = 0;
		this.imaginaria = 0;
	}

	//Constructor #1

	public Complejo(double real, double imaginaria){
		this.real = real;
		this.imaginaria = imaginaria;
	}

//Crear Metodos

	//Metodo setReal

	public void setReal(double real){
		this.real = real;
	}

	//Metodo getReal

	public double getReal(){
		return real;
	}

	//Metodo setImaginaria

	public void setImaginaria(double imaginaria){
		this.imaginaria = imaginaria;
	}

	//Metodo getImaginaria

	public double getImaginaria(){
		return imaginaria;
	}

}