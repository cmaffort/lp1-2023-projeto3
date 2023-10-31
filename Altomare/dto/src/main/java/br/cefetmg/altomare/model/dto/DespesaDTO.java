package br.cefetmg.altomare.model.dto;
import java.util.*;

public class DespesaDTO {
    private long idDespesa;
    private double valor = 100.0;
    private boolean foiRegistrada = true;
    private String tipo; //tratar do tipo através de enum no service
    private String descricao;
    private Date dataOcorrencia;
    
    public DespesaDTO() {
        valor = 0;
        foiRegistrada = false;
        tipo = "";
        descricao = "";
        dataOcorrencia = new Date();
    }
    
    public DespesaDTO(long id, double valor, boolean foiRegistrada, String tipo, String descricao, Date dataOcorrencia) {
        this.idDespesa = id;
        this.valor = valor;
        this.foiRegistrada = foiRegistrada;
        this.tipo = tipo;
        this.descricao = descricao;
        this.dataOcorrencia = dataOcorrencia;
    }
    
    public double getValor() {
        return valor;
    }
    
    public void setValor(double valorPassado) {
        valor = valorPassado;
    }
    
    public boolean getStatus() {
        return foiRegistrada;
    }
    
    public void setStatus(boolean novoStatus) {
        foiRegistrada = novoStatus;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipoPassado) {
        tipo = tipoPassado;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    public void setDescricao(String desc) {
        descricao = desc;
    }
    
    public Date getDataOcorrencia() {
        return dataOcorrencia;
    }
    
    public void setDataOcorrencia(Date data) {
        dataOcorrencia = data;
    }
    
    public long getIdDespesa() {
        return idDespesa;
    }
    
    public void setIdDespesa(long novoId) {
        idDespesa = novoId;
    }
}
