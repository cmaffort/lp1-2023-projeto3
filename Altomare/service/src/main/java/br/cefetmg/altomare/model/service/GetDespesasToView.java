package br.cefetmg.altomare.model.service;

import br.cefetmg.altomare.model.dao.*;
import br.cefetmg.altomare.model.dto.*;
import java.util.*;
import java.text.*;

public class GetDespesasToView {
    private ArrayList<DespesaDTO> despesas;
    
    public ContaUsuarioDTO getContaUsuario() {
        //lógica de pegar usuário pela variável de session -> por enquanto inserindo no banco para teste
        
        ContaUsuarioDAO contaManager = new ContaUsuarioDAO();
        ContaUsuarioDTO contaParaDeletar = new ContaUsuarioDTO(true, 0.0, 0);
        contaManager.delete(contaParaDeletar);
        
        ContaUsuarioDTO contaParaAdicionar = new ContaUsuarioDTO(true, 0.0);
        contaManager.inserir(contaParaAdicionar);
        
        DespesaDAO despesaManager = new DespesaDAO();
        DespesaDTO despesaParaDeletar = new DespesaDTO();
        despesaParaDeletar.setIdDespesa(0);
        despesaManager.deletar(despesaParaDeletar);
        
        DespesaDTO despesa1 = new DespesaDTO(100.00, true, "produto", "produto1", new Date(System.currentTimeMillis()), contaParaAdicionar.getIdConta());
        DespesaDTO despesa2 = new DespesaDTO(200.00, true, "produto", "produto2", new Date(System.currentTimeMillis()), contaParaAdicionar.getIdConta());
        DespesaDTO despesa3 = new DespesaDTO(300.00, true, "produto", "produto3", new Date(System.currentTimeMillis()), contaParaAdicionar.getIdConta());
        DespesaDTO despesa4 = new DespesaDTO(400.00, true, "produto", "produto4", new Date(System.currentTimeMillis()), contaParaAdicionar.getIdConta());
        DespesaDTO despesa5 = new DespesaDTO(500.00, true, "produto", "produto5", new Date(System.currentTimeMillis()), contaParaAdicionar.getIdConta());
        
        despesaManager.inserir(despesa1);
        contaParaAdicionar.setTotal(contaParaAdicionar.getTotal() + despesa1.getValor());
        despesaManager.inserir(despesa2);
        contaParaAdicionar.setTotal(contaParaAdicionar.getTotal() + despesa2.getValor());
        despesaManager.inserir(despesa3);
        contaParaAdicionar.setTotal(contaParaAdicionar.getTotal() + despesa3.getValor());
        despesaManager.inserir(despesa4);
        contaParaAdicionar.setTotal(contaParaAdicionar.getTotal() + despesa4.getValor());
        despesaManager.inserir(despesa5);
        contaParaAdicionar.setTotal(contaParaAdicionar.getTotal() + despesa5.getValor());
        
        contaManager.atualizar(contaParaAdicionar);
        
        return contaParaAdicionar;
    }
    
    public ArrayList<DespesaDTO> getDespesas() {
        ContaUsuarioDTO contaParaDespesas = getContaUsuario();
        ContaUsuarioDAO contaManager = new ContaUsuarioDAO();
        
        return contaManager.getDespesas(contaParaDespesas);
    }
}