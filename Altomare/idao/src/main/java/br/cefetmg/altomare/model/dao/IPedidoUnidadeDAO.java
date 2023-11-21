package br.cefetmg.altomare.model.dao;

import br.cefetmg.altomare.model.dto.PedidoUnidadeDTO;
import java.util.*;

public interface IPedidoUnidadeDAO {
    
    boolean inserir(PedidoUnidadeDTO pedidoUnidade);
    
    boolean atualizar(PedidoUnidadeDTO pedidoUnidade);
    
    boolean deletar (PedidoUnidadeDTO pedidoUnidade); 
    
    ArrayList<PedidoUnidadeDTO> buscaPorIdRelaciona(Long id);
}
