//Crear Clase Cocina

public class Cocina{

//Crear Objetos

	private int mesas;
	private int sillas;
	private boolean cocina_leña;
	private boolean cocina_gas;

//Crear Constructores

	//Constructor Default
	
	public Cocina(){
		mesas = 1;
		sillas = 4;
		cocina_leña = true;
		cocina_gas = false;
	}

	//Constructor #1

	public Cocina(int mesas, int sillas, boolean cocina_leña, boolean cocina_gas){
		this.mesas = mesas;
		this.sillas = sillas;
		this.cocina_leña = cocina_leña;
		this.cocina_gas = cocina_gas;
	}

//Crear Metodos

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

	//Metodo setCocinaLeña

	public void setCocinaLeña(boolean cocina_leña){
		this.cocina_leña = cocina_leña;
	}

	//Metodo getCocinaLeña

	public boolean getCocinaLeña(){
		return cocina_gas;
	}

	//Metodo setCocinaGas

	public void setCocinaGas(boolean cocina_gas){
		this.cocina_gas = cocina_gas;
	}

	//Metodo getCocinaGas

	public boolean getCocinaGas(){
		return cocina_gas;
	}

}