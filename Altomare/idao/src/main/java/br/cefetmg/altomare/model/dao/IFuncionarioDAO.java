
package br.cefetmg.altomare.model.dao;

import br.cefetmg.altomare.model.dto.FuncionarioDTO;
import br.cefetmg.altomare.model.dao.exception.PersistenciaException;
import java.util.ArrayList;

public interface IFuncionarioDAO{
    void inserir(FuncionarioDTO funcionario) throws PersistenciaException;
    boolean atualizar(FuncionarioDTO funcionario) throws PersistenciaException;
    boolean delete(FuncionarioDTO funcionario) throws PersistenciaException;
    ArrayList<FuncionarioDTO> listarTodos() throws PersistenciaException;
    FuncionarioDTO consultarPorId(String cpf) throws PersistenciaException;
    FuncionarioDTO consultarPorUsuarioSenha(String cpf, String senha) throws PersistenciaException;
    public String gerarSenha();
}
