//Crear Clase Pan

public class Pan extends Hipermercado{
  
//Crear Atributos
  
  private int fecha_enva;
  private int fecha_venc;
  private int peso;
  private boolean enva_gran;
  private String empresa;
  
//Crear Constructores
  
  //Contrusctor Default
  
  public Pan(){
    super();
    fecha_enva = 270415;
    fecha_venc = 270416;
    peso = 500;
    enva_gran = true;
    empresa = "TejedaZ";
  }
  
//Crear Metodos
  
  //Metodo setFechaEnva
  
  public void setFechaEnva(int fecha_enva){
    this.fecha_enva = fecha_enva;
  }
  
  //Metodo getFechaEnva
  
  public int getFechaEnva(){
    return fecha_enva;
  }
  
  //Metodo setFechaVenc
  
  public void setFechaVenc(int fecha_venc){
    this.fecha_venc = fecha_venc;
  }
  
  //Metodo getFechaVenc
  
  public int getFechaVenc(){
    return fecha_venc;
  }  
  
  //Metodo setPeso
  
  public void setPeso(int peso){
    this.peso = peso;
  }
  
  //Metodo getPeso
  
  public int getPeso(){
    return peso;
  } 
  
  //Metodo setEnvaGran
  
  public void setEnvaGran(Boolean enva_gran){
    this.enva_gran = enva_gran;
  }
  
  //Metodo getEnvaGran
  
  public String getEnvaGran(){
    String a;
    if (enva_gran == true){
      a = "Envasado";
    }
    else{
      a = "Granel";
    }
    return a;
  }
  
  //Metodo setEmpresa
  
  public void setEmpresa(String empresa){
    this.empresa = empresa;
  }
  
  //Metodo getEmpresa
  
  public String getEmpresa(){
    return empresa;
  }
  
}