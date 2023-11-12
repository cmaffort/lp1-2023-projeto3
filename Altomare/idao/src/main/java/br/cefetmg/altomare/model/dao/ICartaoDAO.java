package br.cefetmg.altomare.model.dao;

import br.cefetmg.altomare.model.dto.CartaoDTO;
import java.util.*;

public interface ICartaoDAO {
    
    boolean inserir(CartaoDTO cartao);
    
    boolean atualizar(CartaoDTO cartao);
    
    boolean deletar (CartaoDTO cartao); 
    
    ArrayList<CartaoDTO> buscaPorIdConta(Long id);
}
