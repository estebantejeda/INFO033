//Crear Clase Alumno

class Alumno{
  
//Definir Atributos de la Clase
  
  String estado;
  int notas[] = new notas[5];
  int codigo;
  
//Realizar Metodos
  
  //Metodo estadoActual
  
  public void estadoActual(int promedio, boolean activador){
    if (activador == true){
      if (promedio >= 4){
        estado = "Aprobado";
      }
      else{
        estado = "Desaprobado";
      }
    }
    else{
      estado = "Pendiente";
    }
  }
  
}