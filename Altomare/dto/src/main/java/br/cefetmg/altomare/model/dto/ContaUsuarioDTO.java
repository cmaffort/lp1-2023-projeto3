package br.cefetmg.altomare.model.dto;
import java.util.*;

public class ContaUsuarioDTO {
    private long idConta;
    ArrayList<DespesaDTO> historico;
    ArrayList<CartaoDTO> cartoes;
    private boolean estaAberta;
    private double total;
    
    public ContaUsuarioDTO() {
        historico = new ArrayList<>();
        this.estaAberta = false; //fechada na criação da conta, aberta no momento do embarque
        total = 0;
    }
    
    public ContaUsuarioDTO(long id, ArrayList<DespesaDTO> historico, ArrayList<CartaoDTO> cartoes, double total) {
        this.idConta = id;
        this.historico = historico;
        this.cartoes = cartoes;
        this.estaAberta = true;
        this.total = total;
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
    
    public ArrayList<DespesaDTO> getHistorico() {
        return historico;
    }
    
    public void setHistorico(ArrayList<DespesaDTO> novoHistorico) {
        historico = novoHistorico;
    }
    
    public ArrayList<CartaoDTO> getCartoes() {
        return cartoes;
    }
    
    public void setCartoes(ArrayList<CartaoDTO> novosCartoes) {
        this.cartoes = novosCartoes;
    }
    
    public long getIdConta() {
        return idConta;
    }
    
    public void setIdConta(long novoId) {
        idConta = novoId;
    }
}
