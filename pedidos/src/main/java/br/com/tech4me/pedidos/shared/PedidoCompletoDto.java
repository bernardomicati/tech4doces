package br.com.tech4me.pedidos.shared;

public class PedidoCompletoDto {
    private String id;
    private String nomeCliente;
    private String idDoce;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
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
}
