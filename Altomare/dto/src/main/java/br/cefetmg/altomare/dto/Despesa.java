package br.cefetmg.altomare.dto;

public class Despesa {
    private double valor;
    private boolean foiRegistrada;
    private String tipo; //tratar do tipo através de enum no service
    private String descricao;
    
    Despesa() {
        valor = 0;
        foiRegistrada = false;
        tipo = "";
        descricao = "";
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
}
