package br.com.tech4me.pedidos.shared;

    public class PedidoDto{

    private String nomeCliente;
    private String idDoce;
    private Double valor;

    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public String getIdDoce() {
        return idDoce;
    }
    public void setIdDoce(String idDoce) {
        this.idDoce = idDoce;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    
}
    
   