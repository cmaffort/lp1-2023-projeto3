package br.cefetmg.altomare.model.dao;

import br.cefetmg.altomare.model.dto.DespesaDTO;

public interface IDespesaDAO {
    
    boolean inserir(DespesaDTO despesa);

    boolean atualizar(DespesaDTO despesa);

    boolean deletar(DespesaDTO despesa);
}