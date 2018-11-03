//Crear Clase Smartphone

public class Smartphone extends Hipermercado{
  
//Crear Atributos
  
  private int pulgadas;
  private int ram;
  private int almacenamiento;
  private int bateria;
  private String procesador;
  private String gpu;
  private String os;
  
//Crear Constructor
  
  //Constructor Default
  
  public Smartphone(){
    super();
    pulgadas = 4;
    ram = 512;
    almacenamiento = 4;
    bateria = 2000;
    procesador = "MTK6592M";
    gpu = "Mali-450MP4";
    os = "Android KK 4.4.4";
  }
  
//Crear Metodos
  
  //Metodo setPulgadas
  
  public void setPulgadas(int pulgadas){
    this.pulgadas = pulgadas;
  }
  
  //Metodo getPulgadas
  
  public int getPulgadas(){
    return pulgadas;
  }
  
  //Metodo setRAM
  
  public void setRAM(int ram){
    this.ram = ram;
  }
  
  //Metodo getRAM
  
  public int getRAM(){
    return ram;
  }
  
  //Metodo setAlmacenamiento
  
  public void setAlmacenamiento(int almacenamiento){
    this.almacenamiento = almacenamiento;
  }
  
  //Metodo getAlmacenamiento
  
  public int getAlmacenamiento(){
    return almacenamiento;
  }
  
  //Metodo setBateria
  
  public void setBateria(int bateria){
    this.bateria = bateria;
  }
  
  //Metodo getBateria
  
  public int getBateria(){
    return bateria;
  }
  
  //Metodo setProcesador
  
  public void setProcesador(String procesador){
    this.procesador = procesador;
  }
  
  //Metodo getProcesador
  
  public String getProcesador(){
    return procesador;
  }
  
  //Metodo setGPU
  
  public void setGPU(String gpu){
    this.gpu = gpu;
  }
  
  //Metodo getGPU
  
  public String getGPU(){
    return gpu;
  }
  
  //Metodo setOS
  
  public void setOS(String os){
    this.os = os;
  }
  
  //Metodo getOS
  
  public String getOS(){
    return os;
  }
  
}