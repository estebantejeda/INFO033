class AfiebradoTestDrive{
  public static void main (String args[]){
    
    Afiebrado persona1 = new Afiebrado();
    persona1.nombre = "Billy";
    persona1.temp = 40;
    
    Afiebrado persona2 = new Afiebrado();
    persona2.nombre = "Mary";
    persona2.temp = 36.5;
    
    persona1.medicar();
    persona2.medicar();
    
  }
}