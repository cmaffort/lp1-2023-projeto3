package br.cefetmg.altomare.idao;

import java.util.*;
import br.cefetmg.altomare.dto.ContaUsuarioDTO;
import br.cefetmg.altomare.dto.DespesaDTO;

public interface IContaUsuarioDAO {
    
    boolean inserir(ContaUsuarioDTO contaUsuario);

    boolean atualizar(ContaUsuarioDTO contaUsuario);

    boolean delete(ContaUsuarioDTO contaUsuario);

    ArrayList<DespesaDTO> getDespesas(ContaUsuarioDTO contaUsuario);
}
