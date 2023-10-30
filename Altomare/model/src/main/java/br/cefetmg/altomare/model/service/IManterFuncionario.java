
package br.cefetmg.altomare.model.service;

import br.cefetmg.altomare.model.dto.Funcionario;
import br.cefetmg.altomare.model.exception.NegocioException;
import br.cefetmg.altomare.model.dao.exception.PersistenciaException;
import java.util.List;

public interface IManterFuncionario {
    public long cadastrar(Funcionario funcionario) throws PersistenciaException, NegocioException;
    public boolean alterar(Funcionario funcionario) throws PersistenciaException, NegocioException;
    public boolean excluir(Funcionario funcionario) throws PersistenciaException, NegocioException;
    public List<Funcionario> pesquisarTodos() throws PersistenciaException;
    public Funcionario pesquisarPorId(long cpf) throws PersistenciaException;
    public Funcionario getUserLogin(String cpf, String senha) throws PersistenciaException, NegocioException;
}
