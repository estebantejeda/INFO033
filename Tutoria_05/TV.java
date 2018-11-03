//Crear Clase TV

public class TV extends Hipermercado{
  
//Crear Atributos
  
  private int pulgadas;
  private boolean usb;
  private boolean norm_digi;
  private boolean hdmi;
  
//Crear Constructores
  
  //Constructor Default
  
  public TV(){
    super();
    pulgadas = 14;
    usb = true;
    norm_digi = true;
    hdmi = true;
  }
  
//Crear Metodos
  
  //Metodo setPulgadas
  
  public void setPulgadas(int pulgadas){
    this.pulgadas = pulgadas;
  }
  
  //Metodo getPulgadas
  
  public int setPulgadas(){
    return pulgadas;
  }
  
  //Metodo setUSB
  
  public void setUSB(boolean usb){
    this.usb = usb;
  }
  
  //Metodo getUSB
  
  public String getUSB(){
    String a;
    if(usb){
      a = "Si";
    }
    else{
      a = "No";
    }
    return a;
  }
  
  //Metodo setNormDigi
  
  public void setNormDigi(boolean norm_digi){
    this.norm_digi = norm_digi;
  }
  
  //Metodo getNormDigi
  
  public String getNormDigi(){
    String b;
    if(norm_digi){
      b = "Si";
    }
    else{
      b = "No";
    }
    return b;
  }
  
  //Metodo setHDMI
  
  public void setHDMI(boolean hdmi){
    this.hdmi = hdmi;
  }
  
  //Metodo getHDMI
  
  public String getHDMI(){
    String c;
    if(hdmi){
      c = "Si";
    }
    else{
      c = "No";
    }
    return c;
  } 
  
}