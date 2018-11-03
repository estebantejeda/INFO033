//Crear Clase Policia

class Reten{

//Crear Atributos de la CLase

	Carabinero paco[] = new Carabinero[10];

//

	for (int i = 0; i <= 10; i++){
		if (paco[i].getEdad() >= 50){
			paco[i].setGrado("SubOficial");
		}
		else if (paco[i].getEdad > 30 || paco[i].getEdad < 50){
			paco[i].setGrado("Sargento");
		}
		else{
			paco[i].setGrado("Cabo");
		}
		}
	}


}
