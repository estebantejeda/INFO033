//Importar Librerias a Java

import java.util.*;

//Crear Clase Persona

class Persona{

//Definir Atributos a la Clase

	private String nombre;
	private int edad;
	private int dni;
	private float peso;
	private float altura;
	private char sexo;

//Realizar Constructores

	//Constructor default

	public Persona(){
		nombre = "";
		edad = 0;
		peso = 0;
		altura = 0;
		sexo = 'H';
	}

	//Constructor #1

	public Persona(String nombre, int edad, char sexo){
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = 'H';
		peso = 0;
		altura = 0;
	}

	//Constructor #2

	public Persona(String nombre, int edad, int dni, float peso, float altura, char sexo){
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.peso = peso;
		this.altura = altura;
		this.sexo = sexo;
	}

//Realizar Metodos

	//Metodo calcularIMC

	public int calcularIMC(){
		double imc = peso/(altura*altura);
		int k = 0
		if (imc < 18.5){
			k = -1;
		}
		elif (imc >= 18.5 || imc < 25){
			k = 0;
		}
		else (imc >= 25){
			k = 1;
		}
		return k;
	}

	//Metodo esMayorDeEdad

	public boolean esMayorDeEdad(){
		boolean k = true;
		if (edad < 18){
			k = false;
		}
		return k;
	}

	//Metodo comprobarSexo

	public char comprobarSexo(char sexo){
		if (sexo != 'H' && sexo != 'M'){
			this.sexo = 'H';
		}
		return this.sexo;
	}

	//Metodo toString

	public void toString(){
		System.out.println("nombre: " +nombre);
		System.out.println("edad: " +edad);
		System.out.println("DNI: " +dni);
		System.out.println("peso: " +peso);
		System.out.println("altura: " +altura);
		System.out.println("sexo: " +sexo);
	}

	//Metodo generaDNI

	public int generaDNI(){
		Random aleat = new Random();
		int num;
		for (int i = 0; i <= 8; i++){
			num = aleat.NextInt(25)+65;
			
		}
	}

}