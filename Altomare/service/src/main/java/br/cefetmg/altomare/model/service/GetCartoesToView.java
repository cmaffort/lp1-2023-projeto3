package br.cefetmg.altomare.model.service;

import br.cefetmg.altomare.model.dao.*;
import br.cefetmg.altomare.model.dto.*;
import java.util.*;

public class GetCartoesToView {
    private ArrayList<CartaoDTO> cartoes;

    public ContaUsuarioDTO getContaUsuario() {
        //lógica de pegar usuário pela variável de session -> por enquanto inserindo no banco para teste
        
        ContaUsuarioDAO contaManager = new ContaUsuarioDAO();
        
        return new ContaUsuarioDTO(true, 0, 1);
    }
    
    public ArrayList<CartaoDTO> getCartoes() {
        ContaUsuarioDTO contaParaCartoes = getContaUsuario();
        ContaUsuarioDAO contaManager = new ContaUsuarioDAO();
        
        return contaManager.getCartoes(contaParaCartoes);
    }
}
