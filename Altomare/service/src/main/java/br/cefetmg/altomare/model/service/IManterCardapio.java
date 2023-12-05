
package br.cefetmg.altomare.model.service;

import br.cefetmg.altomare.model.dao.exception.PersistenciaException;
import br.cefetmg.altomare.model.dto.CardapioDTO;
import br.cefetmg.altomare.model.exception.NegocioException;
import java.util.List;


public interface IManterCardapio {
    public void cadastrar(CardapioDTO item) throws PersistenciaException, NegocioException;
    public boolean alterar(CardapioDTO item) throws PersistenciaException, NegocioException;
    public boolean excluir(CardapioDTO item) throws PersistenciaException, NegocioException;
    public List<CardapioDTO> pesquisarTodos() throws PersistenciaException;
    public CardapioDTO pesquisarPorId(String id) throws PersistenciaException;
    CardapioDTO pesquisarPorNome(String nome) throws PersistenciaException;
}