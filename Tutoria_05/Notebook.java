//Crear Clase Notebook

public class Notebook extends Hipermercado{
  
//Crear Atributos
  
  private String marca;
  private String procesador;
  private int almacenamiento;
  private int memoria;
  private int bateria;
  private int autonomia;
  private int cant_usb;
  private boolean ultrabook;
  private boolean teclado;
  private boolean video;
  
//Crear Constructores
  
  //Constructor Default
  
  public Notebook(){
    super();
    marca = "HP";
    procesador = "AMD A4";
    almacenamiento = 500;
    memoria = 4;
    bateria = 2300;
    autonomia = 3;
    cant_usb = 3;
    ultrabook = false;
    teclado = true;
    video = true;
  }
  
//Crear Metodos
  
  //Metodo setMarca
  
  public void setMarca(String marca){
    this.marca = marca;
  }
  
  //Metodo getMarca
  
  public String getMarca(){
    return marca;
  }
  
  //Metodo setProcesador
  
  public void setProcesador(String procesador){
    this.procesador = procesador;
  }
  
  //Metodo getProcesador
  
  public String getProcesador(){
    return procesador;
  }
  
  //Metodo setAlmacenamiento
  
  public void setAlmacenamiento(int almacenamiento){
    this.almacenamiento = almacenamiento;
  }
  
  //Metodo getAlmacenamiento
  
  public int getAlmacenamiento(){
    return almacenamiento;
  }
  
  //Metodo setMemoria
  
  public void setMemoria(int memoria){
    this.memoria = memoria;
  }
  
  //Metodo getMemoria
  
  public int getMemoria(){
    return memoria;
  }
  
  //Metodo setBateria
  
  public void setBateria(int bateria){
    this.bateria = bateria;
  }
  
  //Metodo getBateria
  
  public int getBateria(){
    return bateria;
  }
  
  //Metodo setAutonomia
  
  public void setAutonomia(int autonomia){
    this.autonomia = autonomia;
  }
  
  //Metodo getAutonomia
  
  public int getAutonomia(){
    return autonomia;
  }
  
  //Metodo setCantUSB
  
  public void setCantUSB(int cant_usb){
    this.cant_usb = cant_usb;
  }
  
  //Metodo getCantUSB
  
  public int getCantUSB(){
    return cant_usb;
  }
  
  //Metodo setUltrabook
  
  public void setUltrabook(boolean ultrabook){
    this.ultrabook = ultrabook;
  }
  
  //Metodo getUltrabook
  
  public String getUltrabook(){
    String a;
    if (ultrabook){
      a = "Si";
    }
    else{
      a = "No";
    }
    return a;
  }
  
  //Metodo setTeclado
  
  public void setTeclado(boolean teclado){
    this.teclado = teclado;
  }
  
  //Metodo getTeclado
  
  public String getTeclado(){
    String b;
    if(teclado){
      b = "Latino";
    }
    else{
      b = "USA";
    }
    return b;
  }
  
  //Metodo setVideo
  
  public void setVideo(boolean video){
    this.video = video;
  }
  
  //Metodo getVideo
  
  public String getVideo(){
    String c;
    if (video){
      c = "Dedicado";
    }
    else{
      c = "Integrado";
    }
    return c;
  }
  
}
