package br.cefetmg.altomare.model.dto;
import java.util.*;
import java.text.*;  

public class DespesaDTO {
    private long idDespesa;
    private double valor;
    private boolean foiRegistrada = true;
    private String tipo; //tratar do tipo através de enum no service
    private String descricao;
    private String dataOcorrencia;
    private long idRelacionaConta;
    
    DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
    
    public DespesaDTO() {
        valor = 100.00;
        foiRegistrada = true;
        tipo = "Produto";
        descricao = "teste";
        
        Date date = new Date(System.currentTimeMillis());   
        dataOcorrencia = dateFormat.format(date);
        
        idRelacionaConta = 100;
    }
    
    public DespesaDTO(double valor, boolean foiRegistrada, String tipo, String descricao, Date dataOcorrencia, long idConta) {
        this.valor = valor;
        this.foiRegistrada = foiRegistrada;
        this.tipo = tipo;
        this.descricao = descricao;
        this.dataOcorrencia = dateFormat.format(dataOcorrencia);
        this.idRelacionaConta = idConta;
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
    
    public String getDataOcorrencia() {
        return dataOcorrencia;
    }
    
    public void setDataOcorrencia(String data) {
        dataOcorrencia = data;
    }
    
    public long getIdDespesa() {
        return idDespesa;
    }
    
    public void setIdDespesa(long novoId) {
        idDespesa = novoId;
    }
    
    public long getIdConta() {
        return idRelacionaConta;
    }
    
    public void setIdConta(long novoId) {
        idRelacionaConta = novoId;
    }
}
