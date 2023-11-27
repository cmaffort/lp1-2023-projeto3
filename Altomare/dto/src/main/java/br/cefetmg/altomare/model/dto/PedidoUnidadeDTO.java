package br.cefetmg.altomare.model.dto;

public class PedidoUnidadeDTO {
    
    private double valor;
    private long idPedidoUnidade;
    private String conteudo;
    private long idRelaciona;
    
    public PedidoUnidadeDTO() {
        this.valor = 0;
        this.conteudo = "";
        this.idRelaciona = 0;
    }
    
    public PedidoUnidadeDTO(double valor, String conteudo, long idRelaciona) {
        this.valor = valor;
        this.conteudo = conteudo;
        this.idRelaciona = idRelaciona;
    }
    
    public double getValor() {
        return this.valor;
    }
    
    public void setValor(double newValor) {
        this.valor = newValor;
    }
    
    public String getConteudo() {
        return this.conteudo;
    }
    
    public void setConteudo(String newConteudo) {
        this.conteudo = newConteudo;
    }
    
    public long getIdRelaciona() {
        return this.idRelaciona;
    }
    
    public void setIdRelaciona(long newIdRelaciona) {
        this.idRelaciona = newIdRelaciona;
    }
    
    public long getIdPedidoUnidade() {
        return this.idPedidoUnidade;
    }
    
    public void setIdPedidoUnidade(long newIdPedidoUnidade) {
        this.idPedidoUnidade = newIdPedidoUnidade;
    }
}
