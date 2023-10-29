package br.cefetmg.altomare.service;

import br.cefetmg.altomare.dao.mysql.ContaUsuarioDAO;
import br.cefetmg.altomare.dto.ContaUsuarioDTO;
import br.cefetmg.altomare.dto.DespesaDTO;
import java.util.*;

public class GetDespesasToView {
    private ArrayList<DespesaDTO> despesas;
    private ContaUsuarioDAO conexao;
    //private Passagero passageiro;
    
    GetDespesasToView(/*Passageiro passageiro*/) {
        conexao = new ContaUsuarioDAO();
        //this.passageiro = passageiro;
    }
    
    public ArrayList<DespesaDTO> getDespesas() {
        despesas = conexao.getDespesas(/*passageiro.conta*/);
        return despesas;
    }
}
