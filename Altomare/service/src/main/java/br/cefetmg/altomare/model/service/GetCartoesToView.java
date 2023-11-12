package br.cefetmg.altomare.model.service;

import br.cefetmg.altomare.model.dao.*;
import br.cefetmg.altomare.model.dto.*;
import java.util.*;

public class GetCartoesToView {
    private ArrayList<CartaoDTO> cartoes;

    public ContaUsuarioDTO getContaUsuario() {
        //lógica de pegar usuário pela variável de session -> por enquanto inserindo no banco para teste
        
        ContaUsuarioDAO contaManager = new ContaUsuarioDAO();
        ContaUsuarioDTO contaParaDeletar = new ContaUsuarioDTO(true, 0.0, 0);
        contaManager.delete(contaParaDeletar);
        
        ContaUsuarioDTO contaParaAdicionar = new ContaUsuarioDTO(true, 0.0);
        contaManager.inserir(contaParaAdicionar);
        
        CartaoDAO cartaoManager = new CartaoDAO();
        CartaoDTO cartaoParaDeletar = new CartaoDTO();
        cartaoParaDeletar.setIdCartao(0);
        cartaoManager.deletar(cartaoParaDeletar);
        
        CartaoDTO cartao1 = new CartaoDTO("Cara Legal", new Date(), "debito", 111, 1111111111L, contaParaAdicionar.getIdConta());
        CartaoDTO cartao2 = new CartaoDTO("Cara Bacana", new Date(), "credito", 222, 222222222L, contaParaAdicionar.getIdConta());
        CartaoDTO cartao3 = new CartaoDTO("Cara chato", new Date(), "credito", 333, 12345678L, contaParaAdicionar.getIdConta());
        CartaoDTO cartao4 = new CartaoDTO("batata", new Date(), "debito", 444, 00000000L, contaParaAdicionar.getIdConta());
        CartaoDTO cartao5 = new CartaoDTO("opa", new Date(), "debito", 555, 10101010L, contaParaAdicionar.getIdConta());
        
        cartaoManager.inserir(cartao1);
        cartaoManager.inserir(cartao2);
        cartaoManager.inserir(cartao3);
        cartaoManager.inserir(cartao4);
        cartaoManager.inserir(cartao5);

        return contaParaAdicionar;
    }
    
    public ArrayList<CartaoDTO> getCartoes() {
        ContaUsuarioDTO contaParaCartoes = getContaUsuario();
        ContaUsuarioDAO contaManager = new ContaUsuarioDAO();
        
        return contaManager.getCartoes(contaParaCartoes);
    }
}
