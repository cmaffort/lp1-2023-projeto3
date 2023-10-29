package br.cefetmg.altomare.idao;

import br.cefetmg.altomare.dto.DespesaDTO;

public interface IDespesaDAO {
    
    boolean inserir(DespesaDTO despesa);

    boolean atualizar(DespesaDTO cliente);

    boolean deletar(DespesaDTO despesa);
}
