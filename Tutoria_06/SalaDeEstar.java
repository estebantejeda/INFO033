//Crear Clase SalaDeEstar

public class SalaDeEstar{

//Crear Objetos

	private int tv;
	private int consola;
	private int pc;
	private int sofas;
	private int mesas;
	private int sillas;
	private boolean calefaccion;

//Crear Constructores

	//Constructor Default
	
	public SalaDeEstar(){
		tv = 1;
		consola = 2;
		pc = 1;
		sofas = 3;
		mesas = 1;
		sillas = 6;
		calefaccion = true;
	}

	//Constructor #1

	public SalaDeEstar(int tv, int consola, int pc, int sofas, int mesas, int sillas, boolean calefaccion){
		this.tv = tv;
		this.consola = consola;
		this.pc = pc;
		this.sofas = sofas;
		this.mesas = mesas;
		this.sillas = sillas;
		this.calefaccion = calefaccion;
	}

//Crear Metodos

	//Metodo setTV

	public void setTV(int tv){
		this.tv = tv;
	}

	//Metodo getTV

	public int getTV(){
		return tv;
	}

	//Metodo setConsola

	public void setConsola(int consola){
		this.consola = consola;
	}

	//Metodo getConsola

	public int getConsola(){
		return consola;
	}	

	//Metodo setPC

	public void setPC(int pc){
		this.pc = pc;
	}

	//Metodo getPC

	public int getPC(){
		return pc;
	}

	//Metodo setSofas

	public void setSofas(int sofas){
		this.sofas = sofas;
	}

	//Metodo getSofas

	public int getSofas(){
		return sofas;
	}	

	//Metodo setMesas

	public void setMesas(int mesas){
		this.mesas = mesas;
	}

	//Metodo getMesas

	public int getMesas(){
		return mesas;
	}

	//Metodo setSillas

	public void setSillas(int sillas){
		this.sillas = sillas;
	}

	//Metodo getSillas

	public int getSillas(){
		return sillas;
	}

	//Metodo setCalefaccion

	public void setCalefaccion(boolean calefaccion){
		this.calefaccion = calefaccion;
	}

	//Metodo getCalefaccion

	public boolean getCalefaccion(){
		return calefaccion;
	}

}