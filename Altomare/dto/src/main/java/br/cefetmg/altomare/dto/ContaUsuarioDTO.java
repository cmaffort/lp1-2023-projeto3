package br.cefetmg.altomare.dto;
import java.util.*;

public class ContaUsuarioDTO {
    ArrayList<Despesa> historico;
    private boolean estaAberta;
    private double total;
    
    ContaUsuarioDTO() {
        historico = new ArrayList<>();
        this.estaAberta = false; //fechada na criação da conta, aberta no momento do embarque
        total = 0;
    }
    
    double getTotal() {
        return total;
    }
    
    void setTotal(double valor) {
        total = valor;
    }
    
    boolean getStatusConta() {
        return this.estaAberta;
    }
   
    void setStatusConta(boolean novoStatus) {
        this.estaAberta = novoStatus;
    }
    
    ArrayList<Despesa> getHistorico() {
        return historico;
    }
    
    void setHistorico(ArrayList<Despesa> novoHistorico) {
        historico = novoHistorico;
    }
}