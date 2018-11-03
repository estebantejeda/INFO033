//Crear Clase Factura

public class Factura{

//Crear Atributos

	private String codigo;
	private String descripcion; 
	private int cantidad; 
	private double precio;

//Crear Constructores

	//Constructor #1

	public Factura(String codigo, String descripcion, int cantidad, double precio){
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
		this.precio = precio;
	}

//Crear Metodos

	//Metodo setCodigo

	public void setCodigo(String codigo){
		this.codigo = codigo;
	}

	//Metodo getCodigo

	public String getCodigo(){
		return codigo;
	}

	//Metodo setDescripcion

	public void setDescripcion(String descripcion){
		this.descripcion = descripcion;
	}

	//Metodo getDescripcion

	public String getDescripcion(){
		return descripcion;
	}

	//Metodo setCantidad

	public void setCantidad(int cantidad){
		this.cantidad = cantidad;
		if (cantidad < 0){
			cantidad = 0;
		}
	}

	//Metodo getCantidad

	public int getCantidad(){
		return cantidad;
	}

	//Metodo setPrecio

	public void setPrecio(double precio){
		this.precio = precio;
		if (precio < 0.0){
			precio = 0.0;
		}
	}

	//Metodo getPrecio

	public double getPrecio(){
		return precio;
	}

	//Metodo obtenerMontoFactura

	public double obtenerMontoFactura(){
		double monto = cantidad*precio;
		return monto;
	}

}