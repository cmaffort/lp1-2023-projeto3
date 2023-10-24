package br.cefetmg.altomare.dto;
import java.util.*;

public class Despesa {
    private double valor;
    private boolean foiRegistrada;
    private String tipo; //tratar do tipo através de enum no service
    private String descricao;
    private Date dataOcorrencia;
    
    Despesa() {
        valor = 0;
        foiRegistrada = false;
        tipo = "";
        descricao = "";
        dataOcorrencia = new Date();
    }
    
    double getValor() {
        return valor;
    }
    
    void setValor(double valorPassado) {
        valor = valorPassado;
    }
    
    boolean getStatus() {
        return foiRegistrada;
    }
    
    void setStatus(boolean novoStatus) {
        foiRegistrada = novoStatus;
    }
    
    String getTipo() {
        return tipo;
    }
    
    void setTipo(String tipoPassado) {
        tipo = tipoPassado;
    }
    
    String getDescricao() {
        return descricao;
    }
    
    void setDescricao(String desc) {
        descricao = desc;
    }
    
    Date getDataOcorrencia() {
        return dataOcorrencia;
    }
    
    void setDataOcorrencia(Date data) {
        dataOcorrencia = data;
    }
}
