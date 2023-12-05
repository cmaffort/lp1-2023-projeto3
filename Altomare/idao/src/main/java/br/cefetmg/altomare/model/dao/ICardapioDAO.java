
package br.cefetmg.altomare.model.dao;

import br.cefetmg.altomare.model.dao.exception.PersistenciaException;
import br.cefetmg.altomare.model.dto.CardapioDTO;
import java.util.ArrayList;


public interface ICardapioDAO{
    void inserir(CardapioDTO item) throws PersistenciaException;
    boolean atualizar(CardapioDTO item) throws PersistenciaException;
    boolean delete(CardapioDTO item) throws PersistenciaException;
    ArrayList<CardapioDTO> listarTodos() throws PersistenciaException;
    CardapioDTO consultarPorId(String Id) throws PersistenciaException;
    CardapioDTO consultarPorNome(String nome) throws PersistenciaException;
}
