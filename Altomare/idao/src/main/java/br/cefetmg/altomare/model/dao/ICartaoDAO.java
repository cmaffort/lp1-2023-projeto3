package br.cefetmg.altomare.model.dao;

import br.cefetmg.altomare.model.dto.CartaoDTO;

public interface ICartaoDAO {
    
    boolean Inserir(CartaoDTO cartao);
    
    boolean Atualizar(CartaoDTO cartao);
    
    boolean Deletar (CartaoDTO cartao);   
}
