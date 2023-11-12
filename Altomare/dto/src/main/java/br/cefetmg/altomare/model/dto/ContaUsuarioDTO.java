package br.cefetmg.altomare.model.dto;
import java.util.*;

public class ContaUsuarioDTO {
    private long idConta;
    private boolean estaAberta;
    private double total;
    
    public ContaUsuarioDTO() {
        this.estaAberta = false; //fechada na criação da conta, aberta no momento do embarque
        total = 0;
    }
    
    public ContaUsuarioDTO(boolean estado, double total) {
        this.estaAberta = estado;
        this.total = total;
    }
    
    public ContaUsuarioDTO(boolean estado, double total, long idConta) {
        this.estaAberta = estado;
        this.total = total;
        this.idConta = idConta;
    }
    
    public double getTotal() {
        return total;
    }
    
    public void setTotal(double valor) {
        total = valor;
    }
    
    public boolean getStatusConta() {
        return this.estaAberta;
    }
   
    public void setStatusConta(boolean novoStatus) {
        this.estaAberta = novoStatus;
    }
    
    public long getIdConta() {
        return idConta;
    }
    
    public void setIdConta(long novoId) {
        idConta = novoId;
    }
}
