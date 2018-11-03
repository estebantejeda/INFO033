//Crear Clase Dormitorio

public class Dormitorio{

//Crear Objetos

	private int camas;
	private int veladores;
	private int closets;
	private boolean tv;

//Crear Constructores

	//Constructor Default

	public Dormitorio(){
		camas = 2;
		veladores = 3;
		closets = 2;
		tv = true;
	}

	//Constructor #1

	public Dormitorio(int camas, int veladores, int closets, boolean tv){
		this.camas = camas;
		this.veladores = veladores;
		this.closets = closets;
		this.tv = tv;
	}

//Crear Metodos

	//Metodo setCamas

	public void setCamas(int camas){
		this.camas = camas;
	}

	//Metodo getCamas

	public int getCamas(){
		return camas;
	}

	//Metodo setVeladores

	public void setVeladores(int veladores){
		this.veladores = veladores;
	}

	//Metodo getCamas

	public int getVeladores(){
		return veladores;
	}

	//Metodo setClosets

	public void setClosets(int closets){
		this.closets = closets;
	}

	//Metodo getClosets

	public int getClosets(){
		return closets;
	}

	//Metodo setTV

	public void setTV(boolean tv){
		this.tv = tv;
	}

	//Metodo getTV

	public boolean getTV(){
		return tv;
	}	

}