package br.cefetmg.altomare.model.dao;

import java.util.*;
import br.cefetmg.altomare.model.dto.ContaUsuarioDTO;
import br.cefetmg.altomare.model.dto.DespesaDTO;
import br.cefetmg.altomare.model.dto.CartaoDTO;

public interface IContaUsuarioDAO {
    
    boolean inserir(ContaUsuarioDTO contaUsuario);

    boolean atualizar(ContaUsuarioDTO contaUsuario);

    boolean delete(ContaUsuarioDTO contaUsuario);

    ArrayList<DespesaDTO> getDespesas(ContaUsuarioDTO contaUsuario);
    
    ArrayList<CartaoDTO> getCartoes(ContaUsuarioDTO contaUsuario);
    
    ContaUsuarioDTO getContaPorId(Long id);
}