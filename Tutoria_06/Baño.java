//Crear Clase Baño

public class Baño{

//Crear Objetos

	private int acondicionador;
	private int shampoo;
	private int jabones;
	private boolean art_toc;
	private boolean calefont;
	private boolean espejo;
	private boolean lavadora;
	private boolean secadora;

//Crear Constructores

	//Constructor Default
	
	public Baño(){
		acondicionador = 1;
		shampoo = 1;
		jabones = 2;
		art_toc = true;
		calefont = false;
		espejo = true;
		lavadora = true;
		secadora = false;
	}

	//Constructor #1

	public Baño(int acondicionador, int shampoo, int jabones, boolean art_toc, boolean calefont, boolean espejo, boolean lavadora, boolean secadora){
		this.acondicionador = acondicionador;
		this.shampoo = shampoo;
		this.jabones = jabones;
		this.art_toc = art_toc;
		this.calefont = calefont;
		this.espejo = espejo;
		this.lavadora = lavadora;
		this.secadora = secadora;
	}

//Crear Metodos

	//Metodo setAcondicionador

	private void setAcondicionador(int acondicionador){
		this.acondicionador = acondicionador;
	}

	//Metodo getAcondicionador

	public int getAcondicionador(){
		return acondicionador;
	}

	//Metodo setShampoo

	public void setShampoo(int shampoo){
		this.shampoo = shampoo;
	}

	//Metodo getShampoo

	public int getShampoo(){
		return shampoo;
	}

	//Metodo setJabones

	public void setJabones(int jabones){
		this.jabones = jabones;
	}

	//Metodo getJabones

	public int getJabones(){
		return jabones;
	}

	//Metodo setArtToc

	public void setArtToc(boolean art_toc){
		this.art_toc = art_toc;
	}

	//Metodo getArtToc

	public boolean getArtToc(){
		return art_toc;
	}

	//Metodo setCalefont

	public void setCalefont(boolean calefont){
		this.calefont = calefont;
	}

	//Metodo getCalefont

	public boolean getCalefont(){
		return calefont;
	}

	//Metodo setEspejo

	public void setEspejo(boolean espejo){
		this.espejo = espejo;
	}

	//Metodo getEspejo

	public boolean getEspejo(){
		return espejo;
	}

	//Metodo setLavadora

	public void setLavadora(boolean lavadora){
		this.lavadora = lavadora;
	}

	//Metodo getLavadora

	public boolean getLavadora(){
		return lavadora;
	}

	//Metodo setSecadora

	public void setSecadora(boolean secadora){
		this.secadora = secadora;
	}

	//Metodo getCalefont

	public boolean getSecadora(){
		return secadora;
	}	

}