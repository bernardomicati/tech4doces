package br.com.tech4doce.doceria.shared;


public class DoceDto {
  private String id;
  private String sabor;
  private String tamanho;
  private Double valor;

  
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  public String getSabor() {
    return sabor;
  }
  public void setSabor(String sabor) {
    this.sabor = sabor;
  }
  
  public String getTamanho() {
    return tamanho;
  }
  public void setTamanho(String tamanho) {
    this.tamanho = tamanho;
  }
  public double getValor() {
    return valor;
  }
  public void setValor(double valor) {
    this.valor = valor;
  }
  

  
  
}
