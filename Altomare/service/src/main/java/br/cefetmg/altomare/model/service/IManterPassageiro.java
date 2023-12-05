package br.cefetmg.altomare.model.service;

import br.cefetmg.altomare.model.exception.NegocioException;
import br.cefetmg.altomare.model.dao.exception.PersistenciaException;
import br.cefetmg.altomare.model.dto.PassageiroDTO;
import java.util.List;

public interface IManterPassageiro {
    public long cadastrar(PassageiroDTO passageiro) throws PersistenciaException, NegocioException;
    public boolean alterar(PassageiroDTO passageiro) throws PersistenciaException, NegocioException;
    public boolean excluir(PassageiroDTO passageiro) throws PersistenciaException, NegocioException;
    public List<PassageiroDTO> pesquisarTodos() throws PersistenciaException;
    public PassageiroDTO pesquisarPorId(String cpf) throws PersistenciaException;
    public PassageiroDTO getUserLogin(String cpf, String senha) throws PersistenciaException, NegocioException;
}