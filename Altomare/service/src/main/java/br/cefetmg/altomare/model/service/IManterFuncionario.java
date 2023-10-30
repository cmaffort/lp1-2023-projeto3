
package br.cefetmg.altomare.model.service;

import br.cefetmg.altomare.model.dto.FuncionarioDTO;
import br.cefetmg.altomare.model.exception.NegocioException;
import br.cefetmg.altomare.model.dao.exception.PersistenciaException;
import java.util.List;

public interface IManterFuncionario {
    public long cadastrar(FuncionarioDTO funcionario) throws PersistenciaException, NegocioException;
    public boolean alterar(FuncionarioDTO funcionario) throws PersistenciaException, NegocioException;
    public boolean excluir(FuncionarioDTO funcionario) throws PersistenciaException, NegocioException;
    public List<FuncionarioDTO> pesquisarTodos() throws PersistenciaException;
    public FuncionarioDTO pesquisarPorId(long cpf) throws PersistenciaException;
    public FuncionarioDTO getUserLogin(String cpf, String senha) throws PersistenciaException, NegocioException;
}
