package br.com.tech4doce.doceria.shared;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class DoceCompletoDto {
  private String id;
  @NotEmpty(message="Campo sabor deve ser informado")
  @NotBlank(message="Os caracteres devem ser informados")
  private String sabor;
  @Size(min=3, max=3, message="Informe Peq, Med, Grd ou Fam")
  private String tamanho;
  @Positive(message="O Valor precisa ser informado")
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
  public Double getValor() {
    return valor;
  }
  public void setValor(Double valor) {
    this.valor = valor;
  }
 
}
