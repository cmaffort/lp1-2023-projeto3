
package br.cefetmg.altomare.model.dao;

import br.cefetmg.altomare.model.dto.Funcionario;
import br.cefetmg.altomare.model.dao.exception.PersistenciaException;
import java.util.ArrayList;

public interface IFuncionarioDAO{
    long inserir(Funcionario funcionario) throws PersistenciaException;
    boolean atualizar(Funcionario funcionario) throws PersistenciaException;
    boolean delete(Funcionario funcionario) throws PersistenciaException;
    ArrayList<Funcionario> listarTodos() throws PersistenciaException;
    Funcionario consultarPorId(long cpf) throws PersistenciaException;
    Funcionario consultarPorUsuarioSenha(String cpf, String senha) throws PersistenciaException;
}
