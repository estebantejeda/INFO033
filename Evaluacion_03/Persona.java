//Importar Librerias

import java.util.*;
import javax.swing.*;

//Crear Clase Persona

public class Persona{
	
//Crear Variables

	private String nombre;
	private String direccion;

//Crear Contructores

	public Persona(String nombre, String direccion)	{
		this.nombre = nombre;
		this.direccion = direccion;
	}

//Crear Metodos

	//Metodo getNombre

	public String getNombre(){
		return nombre;
	}

	//Metodo setDireccion

	public void setDireccion(String direccion){
		this.direccion = direccion;
	}

	//Metodo getDireccion

	public String getDireccion(){
		return direccion;
	}

	//Metodo toCadena

	public String toCadena(){
		String cadena = ((nombre.concat("(")).concat(direccion)).concat(")");
		return cadena;
	}

}