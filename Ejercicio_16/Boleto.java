//Crear Clase Boleto

public class Boleto{

//Crear Atributos

	int num[] = new num[10];

//Crear Objetos

	Random rd = new Random();

//Crear Metodo

	public void escogeNumero(){
		int a = 0;
		for (int i = 0; i < 10; i++){
			num[i] = rd.nextInt(20)+1;;
			for(int j = 0; j < i; i++){
				if (num[i] == j){
					num[i] = rd.nextInt(20)+1;;
				}
			}
		}
	}

}