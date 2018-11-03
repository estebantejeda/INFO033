//Crear Clase Main

public class DemoFecha{
  public static void main (String args[]){
    
//Crear Clase
    
    Fecha fecha_1 = new Fecha();
    
//Mostrar Valores Predeterminados
    
    System.out.println("\nDia Ingresado:" +fecha_1.getDia());
    System.out.println("Mes Ingresado:" +fecha_1.getMes());
    System.out.println("Año Ingresado:" +fecha_1.getAño());
    if(fecha_1.esBisiesto()){
      System.out.println("Es Bisiesto");
    }
    else{
      System.out.println("No es Bisiesto");
    }
    
//Pedir Variables al Usuario  
    
    System.out.println("");
    fecha_1.asignarFecha();
    
//Entregar Variables al Usuario
    
    System.out.println("\nDia Ingresado:" +fecha_1.getDia());
    System.out.println("Mes Ingresado:" +fecha_1.getMes());
    System.out.println("Año Ingresado:" +fecha_1.getAño());
    if(fecha_1.esBisiesto()){
      System.out.println("Es Bisiesto");
    }
    else{
      System.out.println("No es Bisiesto");
    }
  }
  
}