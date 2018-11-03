//Crear Clase Alimentos

public class Alimentos extends Hipermercado{
  
//Crear Atributos
  
  private int fecha_elab;
  private int fecha_venc;
  private int materia_gs;
  private int formato;
  private String empresa;
  
//Crear Constructores
  
  //Contrusctor Default
  
  public Alimentos(){
    super();
    fecha_elab = 270415;
    fecha_venc = 270416;
    materia_gs = 20;
    formato = 500;
    empresa = "TejedaZ";
  }
  
//Crear Metodos
  
  //Metodo setFechaElab
  
  public void setFechaElab(int fecha_elab){
    this.fecha_elab = fecha_elab;
  }
  
  //Metodo getFechaElab
  
  public int getFechaElab(){
    return fecha_elab;
  }
  
  //Metodo setFechaVenc
  
  public void setFechaVenc(int fecha_venc){
    this.fecha_venc = fecha_venc;
  }
  
  //Metodo getFechaElab
  
  public int getFechaVenc(){
    return fecha_venc;
  }
  
  //Metodo setMateriaGs
  
  public void setMateriaGs(int materia_gs){
    this.materia_gs = materia_gs;
  }
  
  //Metodo getMateriaGs
  
  public int getMateriaGs(int materia_gs){
    return materia_gs;
  }
  
  //Metodo setFormato
  
  public void setForamto(int formato){
    this.formato = formato;
  }
  
  //Metodo getFormato
  
  public int getFormato(){
    return formato;
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