package br.cefetmg.altomare.dto;
import java.util.*;

public class ContaUsuarioDTO {
    ContaMonetariaDTO contaMonetaria;
    HistoricoGastosDTO historicoGastos;
    private boolean estaAberta;
    
    ContaUsuarioDTO() {
        this.contaMonetaria = new ContaMonetariaDTO();
        this.historicoGastos = new HistoricoGastosDTO();
        this.estaAberta = false; //fechada na criação da conta, aberta no momento do embarque
    }
    
    boolean adicionarGasto(String despesa, double valor, Date data) { //futuramente classe Produto
        if (getStatusConta()) {
            contaMonetaria.debitarValor(valor);
            historicoGastos.adicionaGasto(despesa, valor, data);
            return true;
        }
        return false;
    }   
    
    double getTotal() {
        return contaMonetaria.getTotal();
    }
    
    boolean getStatusConta() {
        return this.estaAberta;
    }
   
    void setStatusConta(boolean novoStatus) {
        this.estaAberta = novoStatus;
    }
    
    void ImprimeHistorico() {
        historicoGastos.imprimeHistorico();
    }
}