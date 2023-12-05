
package br.cefetmg.altomare.model.service;

import br.cefetmg.altomare.model.dao.CardapioDAO;
import br.cefetmg.altomare.model.dao.ICardapioDAO;
import br.cefetmg.altomare.model.dao.exception.PersistenciaException;
import br.cefetmg.altomare.model.dto.CardapioDTO;
import br.cefetmg.altomare.model.dto.ProdutoDTO;
import br.cefetmg.altomare.model.exception.NegocioException;
import java.sql.SQLException;
import java.util.List;


public class ManterCardapio implements IManterCardapio{
    final ICardapioDAO cardapioDAO;
    
    public ManterCardapio() throws SQLException, ClassNotFoundException {
        cardapioDAO = new CardapioDAO();
    }
     @Override
     public void cadastrar(CardapioDTO cardapio) throws PersistenciaException, NegocioException{
         
         if((cardapio.getId() == null) || (cardapio.getId().isEmpty()))
              throw new NegocioException("Por favor informe o id do item do cardápio.");
         
          if((cardapio.getDescricao() == null) || (cardapio.getDescricao().isEmpty()))
             throw new NegocioException("Por favor informe a descrição do item do cardápio.");
         
          if((cardapio.getFoto() == null) || (cardapio.getFoto().isEmpty()))
             throw new NegocioException("Por favor insira uma foto do item do cardápio.");
         
         if((cardapio.getNome() == null) || (cardapio.getNome().isEmpty()))
             throw new NegocioException("Por favor informe o nome do item do Cardápio.");
         
         if(cardapio.getPreco() == null || cardapio.getPreco().isEmpty())
             throw new NegocioException("Por favor informe o preço do item do cardápio.");
         
         cardapioDAO.inserir(cardapio);
         
     }
     
     @Override
     public boolean alterar(CardapioDTO cardapio) throws PersistenciaException, NegocioException{
         
          if((cardapio.getId() == null) || (cardapio.getId().isEmpty()))
              throw new NegocioException("Por favor informe o id do item do cardápio.");
         
          if((cardapio.getDescricao() == null) || (cardapio.getDescricao().isEmpty()))
             throw new NegocioException("Por favor informe a descrição do item do cardápio.");
         
          if((cardapio.getFoto() == null) || (cardapio.getFoto().isEmpty()))
             throw new NegocioException("Por favor insira uma foto do item do cardápio.");
         
         if((cardapio.getNome() == null) || (cardapio.getNome().isEmpty()))
             throw new NegocioException("Por favor informe o nome do item do Cardápio.");
         
         if(cardapio.getPreco() == null || cardapio.getPreco().isEmpty())
             throw new NegocioException("Por favor informe o preço do item do cardápio.");
     
        cardapioDAO.atualizar(cardapio);
        return true;
     }
     
     @Override
     public boolean excluir(CardapioDTO cardapio) throws PersistenciaException, NegocioException{
         
         boolean result = cardapioDAO.delete(cardapio);
         return result;
     }
     
     @Override
     public List<CardapioDTO> pesquisarTodos() throws PersistenciaException{
         List<CardapioDTO> result = cardapioDAO.listarTodos();
         return result;
     }
     
    @Override
     public CardapioDTO pesquisarPorId(String id) throws PersistenciaException{
         CardapioDTO result = cardapioDAO.consultarPorId(id);
         return result;
     }
     
     @Override
     public CardapioDTO pesquisarPorNome(String nome) throws PersistenciaException{
         CardapioDTO result = cardapioDAO.consultarPorId(nome);
         return result;
     }
}
       
