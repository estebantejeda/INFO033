//Crear Clase Banco

class Banco{

//Definir Atributos a la Clase

	String codigo;
	int num;

//Llamar Objetos a la Clase

	CtaAhorro cuenta[] = new CtaAhorro[num];

//Crear Metodos

	//Metodo aplicaReajuste

	public void aplicaReajuste(){
		for (int i = 0; i < num; i++){
			if (cuenta[i].giros > 4){
				cuenta[i].saldo = cuenta[i].saldo*1.01;
			}
			else if (cuenta[i].giros >= 1 || cuenta[i].giros <= 4){
				cuenta[i].saldo = cuenta[i].saldo*1.03;
			}
			else{
				cuenta[i].saldo = cuenta[i].saldo*1.05;
			}
		}
	}	
}