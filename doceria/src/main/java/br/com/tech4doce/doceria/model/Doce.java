package br.com.tech4doce.doceria.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("doces")
public class Doce {
  @Id
  private String id;
  private String sabor;
  private String tamanho;
  private Double valor;

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
  public Double getValor() {
    return valor;
  }
  public void setValor(Double valor) {
    this.valor = valor;
  }
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  } 
}
