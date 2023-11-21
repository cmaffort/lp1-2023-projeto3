package br.cefetmg.altomare.model.dto;

public class PedidoUnidadeDTO {
    private double valor;
    private String dataOcorrencia;
    private long idPedidoUnidade;
    private String conteudo;
    private long idRelaciona;
    
    public PedidoUnidadeDTO() {
        this.valor = 0;
        this.dataOcorrencia = "";
        this.conteudo = "";
        this.idRelaciona = 0;
    }
    
    public PedidoUnidadeDTO(double valor, String dataOcorrencia, String conteudo, long idRelaciona) {
        this.valor = valor;
        this.dataOcorrencia = dataOcorrencia;
        this.conteudo = conteudo;
        this.idRelaciona = idRelaciona;
    }
    
    public double getValor() {
        return this.valor;
    }
    
    public void setValor(double newValor) {
        this.valor = newValor;
    }
    
    public String getDataOcorrencia() {
        return this.dataOcorrencia;
    }
    
    public void setDataOcorrencia(String newDataOcorrencia) {
        this.dataOcorrencia = newDataOcorrencia;
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
