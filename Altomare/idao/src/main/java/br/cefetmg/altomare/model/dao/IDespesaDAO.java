package br.cefetmg.altomare.model.dao;

import br.cefetmg.altomare.model.dto.DespesaDTO;
import java.util.*;

public interface IDespesaDAO {
    
    boolean inserir(DespesaDTO despesa);

    boolean atualizar(DespesaDTO despesa);

    boolean deletar(DespesaDTO despesa);
    
    ArrayList<DespesaDTO> buscaPorIdConta(Long id);
}