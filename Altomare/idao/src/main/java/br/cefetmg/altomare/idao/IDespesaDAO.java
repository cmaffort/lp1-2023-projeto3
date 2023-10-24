package br.cefetmg.altomare.idao;

import br.cefetmg.altomare.dto.Despesa;

public interface IDespesaDAO {
    
    boolean inserir(Despesa despesa);

    boolean atualizar(Despesa cliente);

    boolean delete(Despesa despesa);

    String getInfo(Despesa despesa);
}
