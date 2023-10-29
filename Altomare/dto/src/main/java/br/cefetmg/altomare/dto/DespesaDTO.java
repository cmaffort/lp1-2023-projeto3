package br.cefetmg.altomare.dto;
import java.util.*;

public class DespesaDTO {
    private long idDespesa;
    private double valor;
    private boolean foiRegistrada;
    private String tipo; //tratar do tipo através de enum no service
    private String descricao;
    private Date dataOcorrencia;
    
    DespesaDTO() {
        valor = 0;
        foiRegistrada = false;
        tipo = "";
        descricao = "";
        dataOcorrencia = new Date();
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
